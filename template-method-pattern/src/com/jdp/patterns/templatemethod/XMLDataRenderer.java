package com.jdp.patterns.templatemethod;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String processData(String data) {
		return "Processed ".concat(data);
	}

	@Override
	public String readData() {
		return "XML Data";
	}

}
