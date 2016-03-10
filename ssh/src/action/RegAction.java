package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import service.RegService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import entity.Reg;

public class RegAction extends ActionSupport{
	private Reg reg;
	private RegService regService;
	
	public String execute() throws Exception {  
		
    	return Action.SUCCESS;  
    }
	
	public String reg() throws Exception {  
		regService.regService(reg);
		
    	return Action.SUCCESS;  
    }
	
	//登录
	public String checkLogin(){
		//根据用户名取出数据库中的内容
		Reg checkReg = regService.checkLogin(reg);
		if(checkReg==null || !reg.getPassword().equals(checkReg.getPassword())){
			//账号或密码错误
		}else{
			HttpSession session = ServletActionContext.getRequest().getSession();
			//如果有登录信息除去
			if(session.getAttribute("curUsrName") != null) {
				session.removeAttribute("curUsrName");
			}
			//加入新的登录信息
			session.setAttribute("curUsrName", checkReg.getUsername());
		}
    	return Action.SUCCESS;
    }
	
	//从session中取登录信息
	public String view(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(session.getAttribute("curUsrName")!=null)
			System.out.println(session.getAttribute("curUsrName"));
		else
			System.out.println("无");
		
		return Action.INPUT;
	}
	
	public Reg getReg() {
		return reg;
	}
	
	public void setReg(Reg reg) {
		this.reg = reg;
	}
	
	public RegService getRegService() {
		return regService;
	}
	
	public void setRegService(RegService regService) {
		this.regService = regService;
	}
}
