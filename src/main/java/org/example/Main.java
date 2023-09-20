package org.example;

public class Main {

	public static void main(String[] args) {
		InputView inputView = new InputView();
		inputView.printInput();

		Cars cars = new Cars(inputView.getInputs());
	}
}