package SessionProgramsJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest 
{

	@Test
	void test() {
		Testing t = new Testing();
		int output = t.countA("kalina sakina");
		assertEquals(4, output);
	}

}