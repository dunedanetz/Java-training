package chapter5;

import java.util.Scanner;

public class Rectangle {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a rectangle's length: ");
        int length = scanner.nextInt();
        System.out.println("Please provide a rectangle's width: ");
        int width = scanner.nextInt();

        boolean isSquare = checkRectangle(length, width);
        printResult(isSquare);
    }
    public static boolean checkRectangle(int length, int width){
        if(length == width)
            return true;
        else
            return false;
    }
    public static void printResult(boolean checkSquare){
        if(checkSquare)
            System.out.println("Square!");
        else
            System.out.println("Rectangle!");
    }
}
