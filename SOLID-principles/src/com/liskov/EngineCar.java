package com.liskov;

public class EngineCar extends Car {

	int engine_cc;

	public void testAcceleration() {
		System.out.println("Aceleration is very high as engine is embedded and produces smoke(harmful to env)");
	}

}
