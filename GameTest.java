package paketolamp;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.Assert;

import org.junit.jupiter.api.Test;

class GameTest {

	static Random dicenumber = new Random();

	@Test
	void testRoll_1() {
		int dice;
		dice = 1 + dicenumber.nextInt(6);
		Assert.assertTrue(dice >= 1 && dice <= 6);
	}

}
