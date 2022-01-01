package com.company;

import java.util.Scanner;

public class Practical2_3 {

    static int hours;
    static int wage;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=5 ; i++) {
            System.out.println( "For Employee: "+ i);
            System.out.println("Enter the number of hours Worked: ");
            hours = sc.nextInt();
            System.out.println("Enter the Wage");
            wage = sc.nextInt();
            CALCULATEPAYMENT();
        }


    }

    public  static void CALCULATEPAYMENT(){
        int salary;

        if (hours>60)
        {
            salary = hours*wage*2;
        }
        else
        {
            salary = hours*wage;
        }
        System.out.println("Salary is: "+ "$"+salary);
    }
}
