package com.hcl2;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	ArrayList s=new ArrayList();
	String name;
	String str;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the username 1");
	name=input.nextLine();
	s.add(name);
	System.out.println("Do u want to continue");
	str=input.nextLine();
	if(str.equals("a"))
    {
        System.out.println("enter username 2");
        name=input.nextLine();
        s.add(name);
    }
	System.out.println("the names are");
	System.out.println(s);
    }
}
