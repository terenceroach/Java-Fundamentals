package bites.examples;

public class FizzBuzz {
    public int num;

    public static String play(int num){
        if(num % 15 == 0){
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(num);
        }
    }


    public static void main(String[] args) {
        FizzBuzz fizzbuzz1 = new FizzBuzz();
        FizzBuzz fizzbuzz2 = new FizzBuzz();
        FizzBuzz fizzBuzz3 = new FizzBuzz();

        System.out.println(fizzbuzz1.play(1));
        System.out.println(fizzbuzz1.play(3));
        System.out.println(fizzbuzz1.play(5));
        System.out.println(fizzbuzz1.play(15));

        for(Integer i = 1; i <= 100; i++){
            System.out.println(fizzbuzz2.play(i));
        }

        Integer counter = 100;
        while (counter >= 1){
            System.out.println(fizzbuzz2.play(counter));
            counter--;
        }
    }
}
