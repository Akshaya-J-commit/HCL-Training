package com.hcl2;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String initial, rev="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter humpty's sentence");
        initial=in.nextLine();
        int length=initial.length();
        for(int i=length-1;i>=0;i--)
            rev=rev+initial.charAt(i);
        System.out.println("Dumpty's sentence: "+rev);

    }
}
