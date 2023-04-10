package chapter4;

import java.util.Scanner;

public class ExerciseTwo {

    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a short sentence:");

        String text = scanner.nextLine();
        int charCount = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a'){
                charCount++;
            }
        }
        System.out.println("Count of character 'a' on String provided: " + charCount);
    }
}
