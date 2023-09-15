/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

// Java program to illustrate for loop.
class Loops {
    public static void main(String args[]) {
        int sum = 0;
/*
        // for loop begins
        // and runs till x <= 20
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
        int a = 23;
        while (true) {
            System.out.println(a);
            a++;
            if (a > 100) {
                break;
            }
        }
        
        int a =1;
        do{
            System.out.println(a);
            a++;
        }while(a<100);
        */
        int a = 1;
        do{
            a++;
            System.out.println(a);
            if(a==65)continue;
        }while(a<100);
    }
}
