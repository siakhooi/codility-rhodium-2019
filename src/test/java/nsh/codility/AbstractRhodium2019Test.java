package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractRhodium2019Test {
	abstract Rhodium2019Interface getTestObject();

	@Test
	void test01() {
		int[] T = new int[] { 2, 0, 2, 2, 1, 0 };
		int a = 12;
		assertEquals(a, getTestObject().solution(T));
	}

	@Test
	void test02() {
		int[] T = new int[] { 1, 2, 3, 4, 4 };
		int a = 15;
		assertEquals(a, getTestObject().solution(T));
	}

	@Test
	void test03() {
		int[] T = new int[] { 1, 4, 2, 2, 2, 4 };
		int a = 15;
		assertEquals(a, getTestObject().solution(T));
	}

	@Test
	void test04() {
		int[] T = new int[] { 0, 0, 0 };
		int a = 5;
		assertEquals(a, getTestObject().solution(T));
	}

	@Test
	void test05() {
		int[] T = new int[] { 2, 2, 2 };
		int a = 5;
		assertEquals(a, getTestObject().solution(T));
	}

	@Test
	void test06() {
		int[] T = new int[] { 3, 0, 2, 2, 1, 0 };
		int a = 11;
		assertEquals(a, getTestObject().solution(T));
	}

	@Test
	@DisplayName("Star")
	void test07() {
		int[] T = new int[] { 3, 3, 3, 3, 3, 3, 3 };
		int a = 22;
		assertEquals(a, getTestObject().solution(T));
	}

}
