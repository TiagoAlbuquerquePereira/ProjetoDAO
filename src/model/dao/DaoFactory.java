package model.dao;

import db.DB;
import model.dao.impl.DepartmentDAOJDBC;
import model.dao.impl.SellerDAOJDBC;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDAOJDBC(DB.getconnection());
	}
	
	public static DepartmentDAO createDepartmentDao() {
		return new DepartmentDAOJDBC(DB.getconnection());
	}

}
