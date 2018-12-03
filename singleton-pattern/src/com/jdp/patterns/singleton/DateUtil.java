package com.jdp.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable {

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil instance;

	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}
		return instance;
	}

	private DateUtil() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	private Object readResolve() {
		return instance;
	}

}
