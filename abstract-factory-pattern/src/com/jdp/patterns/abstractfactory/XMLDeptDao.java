package com.jdp.patterns.abstractfactory;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving department to XML.");
	}

}
