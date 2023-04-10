package chapter5;

import java.util.Scanner;

public class Characters {

    public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide a character:");
    String character = scanner.nextLine();

    char c = character.charAt(0);

    boolean isCapital = checkCharacter(c);
    printResult(isCapital);
}
    public static boolean checkCharacter(char c){
        if(Character.isUpperCase(c))
            return true;
        else
            return false;
    }
    public static void printResult(boolean checkCharacter){
        if(checkCharacter)
            System.out.println("Capital letter!");
        else
            System.out.println("Lower case!");
    }
}