package com.liskov;

public class ElectricCar extends Car {
	int battery_capacity;

	public void testAcceleration() {
		System.out.println(
				"Aceleration is very high initially but will be at constant rate later as engine is not embedded and doesn't produces smoke(good to env)");
	}

}
