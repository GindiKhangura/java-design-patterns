package com.jdp.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
		DaoAbstractFactory factory = DaoFactoryProducer.produce("xml");
		Dao dao = factory.createDao("employee");
		dao.save();

		factory = DaoFactoryProducer.produce("db");
		dao = factory.createDao("dept");
		dao.save();
	}

}
