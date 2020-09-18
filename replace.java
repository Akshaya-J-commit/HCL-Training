package com.hcl2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s;
        String s1;
        System.out.println("enter humpty sentence:");
        s=in.nextLine();
        System.out.println("word to replace:");
        s1=in.nextLine();
        System.out.println("replaced word:");
        String s2=in.nextLine();
        String replaceString=s.replaceAll(s1,s2);
        System.out.println(replaceString);


    }
}
