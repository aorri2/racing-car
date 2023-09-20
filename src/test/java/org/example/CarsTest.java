package org.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarsTest {

	@ParameterizedTest
	@ValueSource(strings = "poby,crong,honux")
	void 경주할_자동차이름을_입력받는다(String inputs) {

		Cars cars = new Cars(inputs);

		assertThat(cars.getCarNameOf(0)).isEqualTo("poby");
		assertThat(cars.getCarNameOf(1)).isEqualTo("crong");
		assertThat(cars.getCarNameOf(2)).isEqualTo("honux");
	}
}
