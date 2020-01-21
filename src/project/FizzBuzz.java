package project;

public class FizzBuzz {

    public String converter(Integer number){
        if (number % 3 == 0 && number % 5 == 0 && number != 0){
            return "fizzbuzz";
        }
        if (number % 3 == 0 && number != 0){
            return "fizz";
        }
        if (number % 5 == 0 && number != 0) {
            return "buzz";
        }
        return number.toString();
    }




    public static void main(String[] args) {
    }
}
