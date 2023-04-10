package Chapter2_homework;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] arg) {

        Scanner data = new Scanner(System.in);

        System.out.println("Please provide your first name:");
        String firstName = data.nextLine();

        System.out.println("Please provide your last name:");
        String lastName = data.nextLine();

        System.out.println("Please provide your age between 0 an 100:");
        int age = data.nextInt();

        System.out.println("Please provide your employee's number between 27560000 an 27569999:");
        int employeeNumber = data.nextInt();

        System.out.println(firstName + " " + lastName + ", age: " + age + ", employee's number: " + employeeNumber + ", email: " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@mentormakers.com");
    }
}

