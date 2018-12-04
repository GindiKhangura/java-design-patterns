package com.jdp.patterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		Dao dao = null;

		if (type.contains("emp")) {
			dao = new XMLEmpDao();
		} else if (type.contains("dept")) {
			dao = new XMLDeptDao();
		}
		return dao;
	}

}
