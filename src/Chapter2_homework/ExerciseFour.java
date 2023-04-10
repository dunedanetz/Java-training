package Chapter2_homework;

import java.util.Scanner;

public class ExerciseFour {

    public static void main(String[] arg) {
        Scanner data = new Scanner(System.in);

        System.out.println("Please provide the total leased money:");
        float totalMoney = data.nextFloat();

        System.out.println("Please provide the down payment:");
        float downPayment = data.nextFloat();

        System.out.println("Please provide the total lease term in months:");
        int totalTerm = data.nextInt();

        System.out.println("Please provide the interest rate:");
        float interest = data.nextFloat();

        float monthlyPayment = ((totalMoney - downPayment) + ((totalMoney - downPayment) * (interest / 100))) / totalTerm;

        System.out.println("Monthly payment amount: " + monthlyPayment);


    }
}
