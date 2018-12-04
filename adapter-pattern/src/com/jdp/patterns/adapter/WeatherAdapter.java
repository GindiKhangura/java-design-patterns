package com.jdp.patterns.adapter;

public class WeatherAdapter {

	public int findTemperature(int zipcode) {
		String city = null;

		if (zipcode == 0) {
			city = "ny";
		} else if (zipcode == 1) {
			city = "sf";
		}

		int weather = new WeatherFinderImpl().find(city);
		return weather;
	}

}
