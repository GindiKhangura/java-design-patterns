package com.jdp.patterns.adapter;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int find(String city) {
		int weather = 0;

		if (city.equals("ny")) {
			weather = 11;
		} else if (city.equals("sf")) {
			weather = 44;
		}

		return weather;
	}

}
