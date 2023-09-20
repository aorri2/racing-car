package org.example;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputViewTest {

	@ParameterizedTest
	@ValueSource(strings = "poby,crong,honux")
	void 입력한_자동차_이름을_출력한다(String input) {
		InputView sut = new InputView();
		String expected = "poby,crong,honux";


		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		OutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		sut.printInput();

		assertThat(out.toString()).contains(expected);
	}
}