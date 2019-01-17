package com.company;

/**
 * Write a program that prints the numbers from 1 to 100.
 * For multiples of 3 print “Fizz” instead of the number.
 * For the multiples of five print “Buzz”.
 * For numbers which are multiples of both 3 and 5 print “FizzBuzz”.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%15 == 0){
                System.out.println("FizBuzz");
            } else if (i%3 == 0){
                System.out.println("Fizz");
            }  else if (i%5 == 0){
                System.out.println("Buzz");
            }  else {
                System.out.println(i);
            }
        }
    }
}
