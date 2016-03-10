package service.impl;

import org.hibernate.Transaction;

import service.RegService;
import dao.RegDAO;
import entity.Reg;

public class RegServiceImpl implements RegService {
	private RegDAO regDAO;
	
	@Override
	public void regService(Reg reg) {
		// TODO Auto-generated method stub
		this.regDAO.reg(reg);
	}
	
	@Override
	public Reg checkLogin(Reg reg) {
		// TODO Auto-generated method stub
		Reg dbReg = this.regDAO.queryByUsrName(reg);
		return dbReg;
	}
	
	public RegDAO getRegDAO() {
		return regDAO;
	}

	public void setRegDAO(RegDAO regDAO) {
		this.regDAO = regDAO;
	}

}
