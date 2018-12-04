package com.jdp.patterns.templatemethod;

public class CSVDataRenderer extends DataRenderer {

	@Override
	public String processData(String data) {
		return "Processed ".concat(data);
	}

	@Override
	public String readData() {
		return "CSV Data";
	}

}
