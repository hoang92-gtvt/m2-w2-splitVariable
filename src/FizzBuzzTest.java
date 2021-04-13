public class FizzBuzzTest {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean izBuzz = number % 5 == 0;
        if(isFizz && izBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(izBuzz)
            return "Buzz";

        return number + "";
    }

}
