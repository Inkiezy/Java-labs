package com.company;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Scanner str = new Scanner(in);

        double x;
        double y;
        double a;
        out.print("Print X: ");
        x=str.nextDouble();
        a = pow(x,4)/(1+pow(x,4));
        y = 0;

       if (x<=1)
           y = asin(x/(pow(x,2)+1));
       else if (x>1 && x<2)
           y = (-log(1-a))/a;
       else
           y = log10(abs(pow(2,-x))*(pow(x,4-x)));


       out.print("y(x)=");
       out.printf("%.2f", y);



    }
}
