package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner str = new Scanner(System.in);
        double y;
        double c;
        double b;
        double d;
        double x;
        System.out.print("Print X: ");
        x=str.nextDouble();

        double s = cos(sqrt(abs(x))); //косинус модуля икс в квадрате
        double a = pow(s, 2) +5; //косинус в квадрате модуля икс в квадрате +5

        b = pow(4,(1/tan(4*x))) +5; //4 в степени котангенс(=1/тангенс(4*x)) +5
        c = (log10(b)/log10(2)) ; //двоичный логарифм (log2(b)=log10(b)/log10(2))

        //d = pow(acos(s/a),5);
        d = pow(acos(s/a),6) ; //арккосинус выражения s/a в 6 степени
        y =pow(d, 1/5) +c; // нахождение y(x)

        System.out.printf("%.2f", y);
        System.out.println();
        if ((x>0 && x<3 && y<0 && y>-3) || (x<0 && x>-3 && y>0 && y<3))
            System.out.println("TRUE");
            else System.out.println("FALSE");


                // x = Math.pow(Math.acos(Math.cos(Math.sqrt(Math.abs(x))))/ Math.pow(Math.cos(Math.sqrt(Math.abs(x))),2), 5) + 5

                ;
    }
}
