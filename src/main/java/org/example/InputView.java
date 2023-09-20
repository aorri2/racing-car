package org.example;

import java.util.Scanner;

public class InputView {
	private String inputs;
	public void printInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		inputs = sc.next();
		System.out.println(inputs);
	}

	public String getInputs() {
		return inputs;
	}
}
