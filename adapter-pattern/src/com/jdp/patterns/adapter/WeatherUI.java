package com.jdp.patterns.adapter;

public class WeatherUI {

	public void showTempterature(int zipcode) {
		int weather = new WeatherAdapter().findTemperature(zipcode);
		System.out.println(weather);
	}

}
