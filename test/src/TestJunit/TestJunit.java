package TestJunit;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunit {

    @BeforeClass
    public static void setUpClass() {
        // code executed before all test methods
    }
     
    @Before
    public void setUp() {
        // code executed before each test method
    }
     
    @Test
    public void testAdd() {
        MessageUtil calculator = new MessageUtil();
        int a = 1234;
        int b = 5678;
        int actual = calculator.add(a, b);
     
        int expected = 6912;
     
        assertEquals(expected, actual);
    }
     
    @Test
    public void testSubtract() {
        // test method
    }
     
    @After
    public void tearDown() {
        // code executed after each test method
    }
     
    @AfterClass
    public static void tearDownClass() {
        // code executed after all test methods
    }
}