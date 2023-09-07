package org.example;

public class Car {
	private final String name;

	public Car(String name) {
		if(name == null || name.isEmpty() || name.isBlank()){
			throw new RuntimeException();
		}

		if(isLengthOverThanFive(name)){
			throw new RuntimeException();
		}

		this.name = name;
	}

	private static boolean isLengthOverThanFive(String name) {
		return name.length() > 5;
	}

	public String getName() {
		return this.name;
	}
}
