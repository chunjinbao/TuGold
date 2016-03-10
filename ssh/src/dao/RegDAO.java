package dao;

import entity.Reg;

public interface RegDAO {
	public void reg(Reg reg);
	
	public Reg queryByUsrName(Reg reg);
}
