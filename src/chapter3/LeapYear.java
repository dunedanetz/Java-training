package chapter3;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random year:");
        int year = scanner.nextInt();
        boolean leap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
