package com.company;

import java.util.Scanner;

public class Practical2_4 {
    public static void main(String[] args) {
        Pythatriplet();
    }

    static void Pythatriplet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
        {
            System.out.println("It's An Pythagorean Triplets");
        }
        else
            System.out.println("Not An Pythagorean Triplets");
    }


}
