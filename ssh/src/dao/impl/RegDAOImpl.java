package dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import dao.RegDAO;
import entity.Reg;

public class RegDAOImpl implements RegDAO {
	private SessionFactory sessionFactory;
	
	@Override
	public void reg(Reg reg) {
		this.getCurrentSession().saveOrUpdate(reg);
	}
	
	@Override
	public Reg queryByUsrName(Reg reg) {
		Criteria criteria = this.qryCurrentSesion().createCriteria(Reg.class);
		criteria.add(Restrictions.eq("username", reg.getUsername()));
		List<Reg> list=criteria.list();
		
		if(list.isEmpty())
			return null;
		else
			return list.get(0);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();// 增删改使用的session
    }

    public Session qryCurrentSesion() {
        return sessionFactory.openSession();// 查询使用的session
    }

}
