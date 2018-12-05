package com.jdp.patterns.decorator;

public class Test {

	public static void main(String[] args) {
		Pizza pizza = new PlainPizza();
		pizza.bake();

		pizza = new VeggiePizzaDecorator(pizza);
		pizza = new CheesePizzaDecorator(pizza);
		pizza.bake();
	}

}
