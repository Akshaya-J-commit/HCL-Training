package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = input.nextInt();
        String a[] = new String[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++) {
            a[i] = input.next();
        }
        System.out.println(Arrays.toString(a));

    }
}
