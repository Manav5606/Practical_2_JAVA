package com.company;

import java.util.*;
import java.lang.NullPointerException;



public class Practical2_2 {
    Scanner sc = new Scanner(System.in);
    static class books{
        String author,title,publisher,copies,price;

        Scanner sc = new Scanner(System.in);
        void input(){
            author = sc.nextLine();
            title = sc.nextLine();
            publisher = sc.nextLine();
            price = sc.nextLine();
            copies = sc.nextLine();
            System.out.println("Enter the following details: ");
            System.out.println("Author's Name: "+author);
            System.out.println("Title: "+title);
            System.out.println("Publisher: "+publisher);
            System.out.println("Price: "+price);
            System.out.println("Nuumber Of Copies: "+copies);
        }

        void check(){
            System.out.println("Enter the following details to search for the book: ");
            System.out.println("Author's Name: "+author);
            System.out.println("Title: "+title);
            System.out.println("Publisher: "+publisher);
            System.out.println("Price: "+price);
            System.out.println("Nuumber Of Copies: "+copies);
        }
    }
    public static void main(String[] args) {
            books obj = new books();


            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of books details you want to enter");
            n = sc.nextInt();


            books  array[]  = new books[n];

//            obj.input();
                for (int i = 0; i <=n; i++)
                {
                 array[i].input();
                }

    }
}
