

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;


import Model.Ball;

class BallTesttest {
	Ball ball;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ball = new Ball(400, 350);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void left() {
        final double expected = 390;
        final double actual = ball.left();
        Assert.assertEquals(actual, expected);
        
	}

}
