package com.akshu;

import java.util.Scanner;

public class Print {


    public static void main(String[] args) {
         String name;
         Scanner input=new Scanner(System.in);
         System.out.println("your good name:");
         name=input.next();
         switch (name)
        {
            case "akshu":
                System.out.println("Its me");
                break;
            case "swetha":
                System.out.println("My sister");
                break;
            case "raji":
                System.out.println("My mom");
                break;
            case "prakash":
                System.out.println("My dad");
                break;
            default :
                System.out.println("veliya ponga da ayiokoya raskal ngala");
                break;
        }

    }
}
