/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

// Java program to illustrate for loop.
class array {
    public static void main(String args[]) {
        int sum = 0;
/*
     /// u can also i
     int marks[] = {12,3 3 4,}
        */
      int mrks[] = new int[5];
      mrks[0] = 12;
      mrks[1] = 23;
      mrks[2] = 34;
      mrks[3] = 65;
      mrks[4] =78;
      for(int i =0;i< mrks.length;i++){
          System.out.println(mrks[i]);
      }
    }
}
