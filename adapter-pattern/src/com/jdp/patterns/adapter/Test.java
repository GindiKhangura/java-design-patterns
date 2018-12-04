package com.jdp.patterns.adapter;

public class Test {

	public static void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.showTempterature(1);
		ui.showTempterature(0);
	}

}
