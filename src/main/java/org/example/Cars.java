package org.example;

import java.util.Arrays;
import java.util.List;

public class Cars {
	public static final String CAR_NAME_DELIMITER = ",";
	private final List<Car> cars;

	public Cars(String input) {
		String[] carsName = splitCarNames(input);
		cars = Arrays.stream(carsName).map(Car::new).toList();
	}

	private String[] splitCarNames(String input) {
		return input.split(CAR_NAME_DELIMITER);
	}

	public String getCarNameOf(int index){
		return cars.get(index).getName();
	}
}
