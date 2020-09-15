package project;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScatchPadTest {

    @Test
    public void countToTen(){
        for (int i = 0;i<10;i++){
            System.out.println(i);
        }
    }
    @Test
    public void whileLoopCountToTen(){

        //arrangement
        int i = 0;
        //Action
        while(i<10){
            System.out.println(i);
            i++;
        }

        //Assertion
        assertEquals(10,i);
        assertTrue(i==10);

    }
}
