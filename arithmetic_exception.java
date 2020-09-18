
package com.hcl2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	try{
	    Scanner in=new  Scanner(System.in);
	    int cost,n;
	    System.out.println("enter the cost of the items for n days:");
	    cost=in.nextInt();
	    System.out.println("enter the n days:");
	    n=in.nextInt();
	    int cost_per_day=cost/n;
	    System.out.println("Cost per day of the item is:"+cost_per_day);

    }
	catch(ArithmeticException e){
	    System.out.println("java.lang.ArithmeticException: / by zero");
    }
    }
}
