package org.example;

public class Car {
	private final String name;

	public Car(String name) {
		if(name == null || name.isEmpty() || name.isBlank()){
			throw new RuntimeException();
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
