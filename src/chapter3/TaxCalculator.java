package chapter3;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide money amount:");
        float totalMoney = scanner.nextFloat();

        int percentage;

        if (totalMoney <= 20000) {
            percentage = 5;
        } else if (totalMoney > 20000 && totalMoney <= 50000) {
            percentage = 10;
        } else {
            percentage = 20;
        }

        float totalTax = ((totalMoney * percentage) / 100);
        System.out.println("Total tax " + totalTax);
    }
}
