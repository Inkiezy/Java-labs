package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.println("Array: ");
                System.out.print("m= ");
                int m = scanner.nextInt();
                int array[] = new int[m];

                for (int i = 0; i < m; i++) {
                    if (Math.random() < 0.3333)
                    {
                        array[i] = -1;
                    }
                    else if (Math.random() < 0.6666)
                    {
                        array[i] = 0;
                    }
                    else
                    {
                        array[i] = 1;
                    }
                }

                for (int i = 0; i < m; i++) {
                    System.out.print(" " + array[i] + " ");
                }
                System.out.println("");

                Arrays.sort(array);

                System.out.print("Ответ: ");
                for (int i = 0; i < m; i++)
                {
                    System.out.print(array[i] + " ");
                }
                System.out.println("");
                System.out.print("---------------------");


            }
        }
