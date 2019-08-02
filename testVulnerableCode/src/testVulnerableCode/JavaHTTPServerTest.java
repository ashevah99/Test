package testVulnerableCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaHTTPServerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		JavaHTTPServer test = new JavaHTTPServer();
		int a = 3;
		int b = 13;
		assertEquals(11, test.add(2, 4));
		assertEquals(16, test.add(a, b));
		
	}

	@Test
	void testSubtract() {
		JavaHTTPServer test = new JavaHTTPServer();
		int a = 3;
		int b = 13;
		assertEquals(test.subtract(a, b), -10);	
	}

}
