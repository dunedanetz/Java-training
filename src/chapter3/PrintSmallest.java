package chapter3;

import java.util.Scanner;

public class PrintSmallest {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide random number:");
        int randomOne = scanner.nextInt();
        System.out.println("Please provide random number:");
        int randomTwo = scanner.nextInt();
        System.out.println("Please provide random number:");
        int randomThree = scanner.nextInt();

        if(randomOne < randomTwo && randomOne < randomThree){
            System.out.println("Smallest number is: " + randomOne);
        } else if (randomTwo < randomOne && randomTwo < randomThree) {
            System.out.println("Smallest number is: " + randomTwo);
        } else{
            System.out.println("Smallest number is: " + randomThree);
        }

    }
}