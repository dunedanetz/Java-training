package Chapter2_homework;

import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] arg) {

        Scanner data = new Scanner(System.in);

        System.out.println("Please provide triangle's height:");
        float height = data.nextFloat();

        System.out.println("Please provide triangle's base:");
        float base = data.nextFloat();

        float triangleArea = (height * base) / 2;

        System.out.println("Triangle's area is: " + triangleArea);
    }
}
