package com.company;

import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner str = new Scanner(System.in);
        int x;
        int a=3;
        int b=3;

        System.out.print("Enter X: ");
        x=str.nextInt();
        int counter = 0;

        int[][] M = new int[a][b];
        Random R = new Random();
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = 50 - R.nextInt(100);
            }
        }

        System.out.println("Array: ");
        for (int i=0;i < M.length;i++,System.out.println()) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] < 0) {
                    if (abs(i - j) < x) {
                        counter++;
                        System.out.print("Place:");
                        System.out.println(i + " " + j);
                    }

                }
            }
        }

        System.out.print("Count:");
        System.out.println(counter);


    }
}