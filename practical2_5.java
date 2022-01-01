package com.company;


import java.util.Scanner;

class ToolBooth{

    int count,cash,cars,tax;

    ToolBooth(){
        count=0;
        cars=0;
        tax=50;
    }

     void Payingcars(){
            cash=cash+tax;
            count=count+1;
    }

     void Nonpayingcars(){
         count=count+1;

    }

     void Display(){

         System.out.println("Total Number Of Cars Passed By ToolBooth: "+count);
         System.out.println("Total Amount of cash collected is: "+cash);
    }


}

public class practical2_5 {
    public static void main(String[] args) {
            ToolBooth obj = new ToolBooth();
            int ch = 0;
            Scanner sc = new Scanner(System.in);
//            obj.Payingcars();
//            obj.Payingcars();
//            obj.Nonpayingcars();
//            obj.Display();

                    System.out.println("Enter the information");
                    System.out.println("1. for paying cars");
                    System.out.println("2. for paying cars");
                    System.out.println("3. Display collected information");

            do {


                System.out.println("Enter an option");
                ch = sc.nextInt();


                switch (ch){
                    case 1:
                        obj.Payingcars();
                        break;

                    case 2:
                        obj.Nonpayingcars();
                        break;

                    case 3:
                        obj.Display();
                        break;


                }

            }while (ch!=4);
    }
}
