package org.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

	Car car;

	@Test
	@DisplayName("자동차에 이름을 부여할 수 있다.")
	void 자동차_이름_부여() {
		String expectedCarName = "wooks";
		car = new Car(expectedCarName);

		assertThat(car.getName()).isEqualTo(expectedCarName);
	}

	@ParameterizedTest
	@NullAndEmptySource
	@DisplayName("자동차 이름은 null이거나 빈문자열일 수 없다.")
	void 자동차_이름_null이나_빈문자열로_생성_불가능(String expectedCarName) {

		assertThatThrownBy(()->new Car(expectedCarName)).isInstanceOf(RuntimeException.class);
	}

	@ParameterizedTest
	@CsvSource({"sixlet,여섯글자이름"})
	@DisplayName("자동차 이름은 한글과 영어 둘다 5자를 초과할 수 없다")
	void 자동차_이름_5자_초과_불가능(String expectedEnglishCarName,String expectedKoreanCarName){


		assertThatThrownBy(()->new Car(expectedEnglishCarName)).isInstanceOf(RuntimeException.class);
		assertThatThrownBy(()->new Car(expectedKoreanCarName)).isInstanceOf(RuntimeException.class);

	}

}