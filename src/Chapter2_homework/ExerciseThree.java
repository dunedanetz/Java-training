package Chapter2_homework;

import java.util.Scanner;

public class ExerciseThree {

    public static void main(String[] arg) {

        int a = -3;
        int b = 2;
        int c = 6;

        int a1 = (a + b) * c;

        System.out.println(a1);

        int aa = 55;
        int bb = 9;

        int ab = (aa + bb) % bb;
        System.out.println(ab);

        int aaa = 22;
        int bbb = -4;
        int ccc = 5;

        int abc = aaa + bbb * ccc / b;
        System.out.println(abc);

        int aaaa = 15;
        int bbbb = 3;
        int cccc = 8;

        int abcd = aaaa + aaaa / bbbb * b - cccc % bbbb;
        System.out.println(abcd);

    }

}
