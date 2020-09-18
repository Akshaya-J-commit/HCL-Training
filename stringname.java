package com.hcl2;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	String s;
	String s1;
Scanner in=new Scanner(System.in);
	System.out.println("enter humpty sentence:");
	s=in.nextLine();
        System.out.println("enter humpty sentence:");
	s1=in.nextLine();
	if(s.contains(s1))
    {
        System.out.println("Found");
    }
	else
    {
        System.out.println("Not Found");
    }
    }
}
