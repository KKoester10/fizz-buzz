package project;

public class FizzBuzz {

    public String interpret(int numberToSay) {
        if (numberToSay % 3 == 0 && numberToSay % 5 == 0){
            return "FizzBuzz";
        }
        if(numberToSay % 3 == 0){
            return "Fizz";
        }
        if(numberToSay % 5 == 0){
            return  "Buzz";
        }
        return "" + numberToSay;

    }
}
