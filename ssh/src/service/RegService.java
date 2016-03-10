package service;

import entity.Reg;

public interface RegService {
	public void regService(Reg reg);
	
	public Reg checkLogin(Reg reg);
}
