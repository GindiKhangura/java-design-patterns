package com.jdp.patterns.templatemethod;

public abstract class DataRenderer {

	public abstract String processData(String data);

	public abstract String readData();

	public void render() {
		String data = readData();
		String processedData = processData(data);
		System.out.println(processedData);
	}

}
