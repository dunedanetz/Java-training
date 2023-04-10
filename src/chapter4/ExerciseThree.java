package chapter4;

import java.util.Scanner;

public class ExerciseThree {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive number:");
        int num = scanner.nextInt();
        boolean isPrime = true;

        for(int checkNum = 2; checkNum <=num/2; ++checkNum){
            if(num % checkNum == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
}
