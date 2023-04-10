package chapter4;

import java.util.Random;
import java.util.Scanner;

public class ExerciseFive {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);

        while (true) {
            System.out.println("Please guess the number: ");
            int guessNum = scanner.nextInt();
            if (guessNum == num) {
                System.out.println("You guessed correctly the generated number.");
                break;
            } else if (guessNum < num) {
                System.out.println("Too low, try again.");
            } else
                System.out.println("Too high, try again.");
        }

        scanner.close();

    }

}


