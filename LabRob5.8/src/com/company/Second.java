package com.company;

import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = scanner.nextInt();
        int a = x % 10;
        int b = (x % 100 - a) / 10;
        x = (x-a-b * 10) / 100;
        int c = Math.max( x , b);
        System.out.println(c);
    }
}