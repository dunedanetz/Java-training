package chapter3;

import java.util.Scanner;

public class Integers {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer:");
        int number = scanner.nextInt();

        if(number == 0){
            System.out.println("The number is zero.");
        }
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        else
            System.out.println("The number is positive.");
    }
}