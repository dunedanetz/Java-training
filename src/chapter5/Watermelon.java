package chapter5;

import java.util.Scanner;

public class Watermelon {

    private static final int discount = 10;
    private static final int discountVip = 5;
    private static final int reachableAmount = 140;
    private static final double price = 13.45;

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many watermelons you wish to purchase? ");
        int quantity = scanner.nextInt();
        System.out.print("Regular client (true or false)? ");
        boolean isRegular = scanner.nextBoolean();

        Watermelon watermelon = new Watermelon();

        System.out.printf("Total Price: " + "%.2f", watermelon.calculateDiscountAmount(quantity, isRegular));
    }

    public static double calculateDiscountAmount(int quantity, boolean isRegular) {
        double totalPrice = price * quantity;
        totalPrice = Math.round(totalPrice);
        if (totalPrice >= reachableAmount) {
            totalPrice = (totalPrice * (100 - discount)) / 100;
        }
        if (isRegular) {
            totalPrice = (totalPrice * (100 - discountVip)) / 100;
        }
        return totalPrice;
    }
}
