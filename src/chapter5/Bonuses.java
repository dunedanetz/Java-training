package chapter5;

// A company decided to give out one-time bonuses to all of its employees. People who were with the company
// for at least 3 years received a 7% bonus, people who were with the company for at least 5 years received
// a 14% bonus and people who were with the company for more than 10 years received a 25% bonus to their paycheck.
// Create a method that accepts two parameters (years of service and paycheck) and calculates the bonus an employee
// will receive based on the criteria mentioned above

import java.util.Scanner;

public class Bonuses {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide years of service:");
        int years = scanner.nextInt();
        System.out.println("Please provide your salary:");
        double salary = scanner.nextDouble();

        calculateBonus(years, salary);
    }

    public static void calculateBonus(int years, double salary) {
        if (years >= 3 && years <= 4) {
            int bonus = 7;
            double calculateBonus = (salary*bonus)/100;
            System.out.println("Your bonus is: " + calculateBonus);
        }
        else if (years >= 5 && years <= 9) {
            int bonus = 14;
            double calculateBonus = (salary*bonus)/100;
            System.out.println("Your bonus is: " + calculateBonus);
        }
        else if (years >= 10) {
            int bonus = 25;
            double calculateBonus = (salary*bonus)/100;
            System.out.println("Your bonus is: " + calculateBonus);
        }
        else
            System.out.println("You need to have at least 3 years with us to get a bonus.");
    }
}

