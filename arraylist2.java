package com.hcl2;

import java.util.ArrayList;
import java.util.*;
class ItemName{
    String name;
    Double deposit;
    Double costperday;
    public ItemName(String name,Double deposit , Double costperday)
    {
        super();
        this.name=name;
        this.deposit=deposit;
        this.costperday=costperday;
    }

    public ItemName() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCostperday() {
        return costperday;
    }

    public void setCostperday(Double costperday) {
        this.costperday = costperday;
    }


    @Override
    public String toString() {
        return String.format("ItemName{name='%-20s', deposit=%-20s, costperday=%-20s}", name, deposit, costperday);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 ArrayList<Object> s=new ArrayList<>();
 ItemName n=new ItemName();
System.out.println("enter the details of item type 1:");
        System.out.println("enter the username 1");
        String name=input.nextLine();
        s.add(name);
        n.setName(name);
        System.out.println("enter the deposit amount:");
        double deposit=input.nextDouble();
        s.add(deposit);
        n.setDeposit(deposit);
        System.out.println("enter the cost:");
        double costperday=input.nextDouble();
        s.add(costperday);
        n.setCostperday(costperday);
        System.out.println("Do u want to continue");
        input.nextLine();
        String str=input.nextLine();
        s.add(n);
        s.add(n.getName());
        s.add(n.getCostperday());
        s.add(n.getDeposit());
       if(str.equals("y"))
       {
           n = new ItemName();
           System.out.println("enter the username 2");
           name=input.nextLine();
           s.add(name);
           n.setName(name);
           System.out.println("enter the deposit amount:");
            deposit=input.nextDouble();
           System.out.println("enter the cost:");
           costperday=input.nextDouble();

           s.add(n);
           s.add(n.getName());
           s.add(n.getCostperday());
           s.add(n.getDeposit());


       }
       System.out.println(s);



    }
}
