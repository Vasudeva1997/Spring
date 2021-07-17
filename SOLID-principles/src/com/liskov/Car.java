package com.liskov;

import java.util.ArrayList;
import java.util.List;

public class Car {

	public void testAcceleration() {
		System.out.println("Aceleration is decent");
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new EngineCar();
		Car car3 = new ElectricCar();
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		
		for(Car car: carList) {
//			System.out.println(car.testAcceleration());
			car.testAcceleration();
		}
	}
}
