package com.jdp.patterns.flyweight;

public class Circle extends Shape {

	private String label;

	public Circle() {
		label = "Cicle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println(label + ", " + radius + ", " + fillColor + ", " + lineColor);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
