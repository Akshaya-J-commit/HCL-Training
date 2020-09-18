package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the two numbers:");
        n1=input.nextInt();
        n2=input.nextInt();
        System.out.println(method2(n1,n2));
    }
	public static int method2(int n1,int n2)
        {
            return(n1+n2);
        }
}
