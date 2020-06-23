

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.Assert;


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
        final double epsilon = 1;
        Assert.assertEquals(actual, expected,epsilon);
        
	}
	@Test
	void right() {
        final double expected = 410;
        final double actual = ball.right();
        final double epsilon =1;
        Assert.assertEquals(actual, expected,epsilon);
        
	}

}
