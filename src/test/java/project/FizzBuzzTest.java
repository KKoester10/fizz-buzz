package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

    @Test
    public void ShouldBeAbleToCreateFizzBuzzObject(){
        //arrange and action
        FizzBuzz underTest = new FizzBuzz();
        //Assertion
        assertTrue(underTest != null);

    }
    @Test
    public void given1ShouldReturn1(){
        //arrange
        FizzBuzz underTest = new FizzBuzz();

        //action
        String result = underTest.interpret(1);

        //assertion
        assertEquals("1",result);
    }
}
