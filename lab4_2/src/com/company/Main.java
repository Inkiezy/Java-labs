package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.println("");
                System.out.println("Enter m:");
                int row_count = scanner.nextInt();
                System.out.println("Enter n: ");
                int column_count = scanner.nextInt();
                int array[][] = new int[row_count][column_count];
                int res[] = new int[row_count];
                for (int i = 0; i < row_count; i++) {
                    for (int j = 0; j < column_count; j++) {
                        array[i][j] = ((int) (Math.random() * 101) - 50);
                    }
                }

                for (int i = 0; i < row_count; i++) {
                    for (int j = 0; j < column_count; j++) {
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println("");
                }

                for (int i = 0; i < row_count; i++) {
                    int m = Math.abs(array[i][0]);
                    for (int j = 1; j < column_count; j++) {
                        m = Math.min(m, Math.abs(array[i][j]));
                    }
                    res[i] = m;
                }

                System.out.print("Массив ответов: ");
                for (int i = 0; i < row_count; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println("");

            }
        }


