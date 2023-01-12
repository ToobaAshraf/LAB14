package unittesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class squaretest1 {

	void test() {
		unittesting obj=new unittesting();
		int output=obj.countA("Aqsa");
		assertEquals(1, output);
	}
}
