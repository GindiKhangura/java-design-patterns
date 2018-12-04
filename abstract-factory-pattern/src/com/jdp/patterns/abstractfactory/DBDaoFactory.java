package com.jdp.patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		Dao dao = null;

		if (type.contains("emp")) {
			dao = new DBEmpDao();
		} else if (type.contains("dept")) {
			dao = new DBDeptDao();
		}
		return dao;
	}

}
