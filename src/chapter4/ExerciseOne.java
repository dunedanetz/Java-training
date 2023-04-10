package chapter4;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = scanner.nextInt();

        for(int start = 1; start <= num; start++){
            System.out.println(start);
        }
    }
}

