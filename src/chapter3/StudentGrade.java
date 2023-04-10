package chapter3;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your grade:");
        int grade = scanner.nextInt();

        String message;

        switch(grade){
            case 10:
                message = "Your grade is A+";
                break;
            case 9:
                message = "Your grade is A";
                break;
            case 7, 8:
                message = "Your grade is B";
                break;
            case 6:
                message = "Your grade is C";
                break;
            case 5:
                message = "Your grade is E";
                break;
            case 0, 1, 2, 3, 4:
                message = "Your grade is F";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);
    }
}
