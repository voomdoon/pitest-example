package de.voomdoon.example.pitest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * DOCME add JavaDoc for
 *
 * @author André Schulz
 *
 * @since DOCME add inception version number
 */
class MyClassTest {

	static class InnerTest {

		@Test
		void test2() {
			assertThat(MyClass.method2()).isEqualTo("test");
		}
	}

	@Test
	void test1() {
		assertThat(MyClass.method1()).isEqualTo("test");
	}
}
