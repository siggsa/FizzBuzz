package project;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz;

    @Before
    public void initFizzBuzz(){
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void oneToOne() {
        assertEquals("1", fizzbuzz.converter(1));
    }

    @Test
    public void threeToFizz() {
        assertEquals("fizz", fizzbuzz.converter(3));
    }

    @Test
    public void fiveToBuzz() {
        assertEquals("buzz", fizzbuzz.converter(5));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("fizzbuzz", fizzbuzz.converter(15));
        assertEquals("fizzbuzz", fizzbuzz.converter(30));
        assertEquals("fizzbuzz", fizzbuzz.converter(45));
    }
}
