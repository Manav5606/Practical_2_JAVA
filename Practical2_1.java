package com.company;

import java.util.Scanner;

public class Practical2_1 {
    public static void main(String[] args) {
        Bankaccount obj1 = new Bankaccount("Manav Patel", "9727899926");
        obj1.Showmenu();
    }
}

class Bankaccount{

        int balance;
        int previoustransaction;
        String customername;
        String customerid;

        Bankaccount(String cname , String cid)
        {
                customername = cname;
                customerid = cid;
        }

        void deposit(int amount)
        {
            if (amount != 0)
            {
                balance=balance+amount;
                previoustransaction = amount;
            }

        }


    void withdraw(int amount)
    {
        if (amount < 0)
        {
            System.out.println("Please enter An Positive Amount");
        }
        else if (balance-amount<500)
        {
            System.out.println("Withdraw is not possible because minimum balance should be 500 ");
        }
        else {
            balance=balance-amount;
            previoustransaction = -amount;
        }

    }

    void getprevioustransaction()
    {
        if (previoustransaction > 0) {
            System.out.println("Deposited: "+previoustransaction);
        }
        else if (previoustransaction < 0)
        {
            System.out.println("Withdrawn: "+Math.abs(previoustransaction));

        }
        else
        {
            System.out.println("No Transaction Occured");
        }
    }

    void Display(){
        System.out.println("Name: "+customername);
        System.out.println("Your Balance: "+balance);
    }

    void Showmenu(){
            int a = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome "+ customername);
        System.out.println("Your ID is: "+customerid);
        System.out.println("\n");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawn");
        System.out.println("4. Previous Transaction");
        System.out.println("5. Display Information");
        System.out.println("6. Exit");
        do {

            System.out.println("Enter an option");
            a = sc.nextInt();


            switch (a)
            {
                case 1:

                    System.out.println("Balance: " + balance);

                    break;

                case 2:

                    System.out.println("Enter an amount to deposit");
                    int amount = sc.nextInt();
                    deposit(amount);

                    break;

                case 3:

                    System.out.println("Enter an amount to Withdrawn");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);

                    break;

                case 4:

                    getprevioustransaction();

                    break;

                case 5:
                    Display();

                    break;
                default :
                    System.out.println("Invalid option");
                    break;

            }
        }while (a!=7);

    }

}
