package com.jdp.patterns.abstractfactory;

public class DaoFactoryProducer {

	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory factory = null;

		if (factoryType.equals("xml")) {
			factory = new XMLDaoFactory();
		} else if (factoryType.equals("db")) {
			factory = new DBDaoFactory();
		}

		return factory;
	}

}
