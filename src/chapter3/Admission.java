package chapter3;

import java.util.Scanner;

public class Admission {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your grade in Maths:");
        int gradeMath = scanner.nextInt();
        System.out.println("Please enter your grade in Biology:");
        int gradeBiology = scanner.nextInt();
        System.out.println("Please enter your grade in Chemistry:");
        int gradeChem = scanner.nextInt();

        int totalAll = gradeBiology + gradeChem + gradeMath;
        int totalMathBio = gradeMath + gradeBiology;

        if(totalAll >= 180 && gradeMath >= 65 && gradeBiology >= 55 && gradeChem >= 50){
            System.out.println("Candidate is eligible for admission.");
        }
        else if (totalMathBio >= 140 && gradeMath >= 65 && gradeBiology >= 55) {
            System.out.println("Candidate is eligible for admission.");
        }
        else
            System.out.println("Candidate is not eligible for admission.");
        }

    }
