package com.company;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        if(x>=50&x<=100){
            System.out.println("Number"+" "+x+" "+"Yes (50;100)");
        }
        else {
            System.out.println("Number"+" "+x+" "+"No (50;100)");
        }
    }
}


