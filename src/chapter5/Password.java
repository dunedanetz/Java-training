package chapter5;

import java.util.Scanner;

public class Password {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a password:");
        String password = scanner.nextLine();

        if (verifyPassword(password))
            System.out.println("Password is valid!");
        else
            System.out.println("Password is not valid. Please try again.");
    }

    public static boolean verifyPassword(String password) {
        if (password == null || password.length() < 8 || password.length() > 16){
            return false;
        }
        int capitalLetters = 0;
        int digits = 0;

        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(ch >= '0' && ch <= '9'){
                digits = digits + 1;
            }
            if (ch >= 'A' && ch <= 'Z'){
                capitalLetters = capitalLetters + 1;
            }
        }
        if (digits >= 2 && capitalLetters >= 1){
            return true;
        }
        return false;
    }
}
