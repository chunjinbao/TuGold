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
	
	//��¼
	public String checkLogin(){
		//�����û���ȡ�����ݿ��е�����
		Reg checkReg = regService.checkLogin(reg);
		if(checkReg==null || !reg.getPassword().equals(checkReg.getPassword())){
			//�˺Ż��������
		}else{
			HttpSession session = ServletActionContext.getRequest().getSession();
			//����е�¼��Ϣ��ȥ
			if(session.getAttribute("curUsrName") != null) {
				session.removeAttribute("curUsrName");
			}
			//�����µĵ�¼��Ϣ
			session.setAttribute("curUsrName", checkReg.getUsername());
		}
    	return Action.SUCCESS;
    }
	
	//��session��ȡ��¼��Ϣ
	public String view(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(session.getAttribute("curUsrName")!=null)
			System.out.println(session.getAttribute("curUsrName"));
		else
			System.out.println("��");
		
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
