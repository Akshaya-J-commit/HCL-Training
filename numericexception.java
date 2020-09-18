

package com.hcl2;
import java.util.Scanner;
class ItemType{
    String name;
    Double deposit;
    Double costpershow;

    public ItemType() {

    }

    ItemType( String name , Double deposit ,Double costpershow) {
        this.name = name;
        this.deposit = deposit;
        this.costpershow = costpershow;
    }


    public String getName(String name){
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

    public Double getCostpershow() {
        return costpershow;
    }

    public void setCostpershow(Double costpershow) {
        this.costpershow = costpershow;
    }

    @Override
    public String toString() {
        return "ItemType{" +
                "name='" + name + '\'' +
                ", deposit=" + deposit +
                ", costpershow=" + costpershow +
                '}';
    }
    public void  display()
    {
        System.out.println("the details are:");
        System.out.println("Name:"+this.name);
        System.out.println("Deposit:"+this.deposit);
        System.out.println("cost per show:"+this.costpershow);
    }
}
public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("enter the item type details:");
            System.out.println(" enter the name:");
            String name = in.nextLine();
            System.out.println("enter the deposit:");
            double deposit = in.nextDouble();
            System.out.println("enter the cost per day:");
            double costpershow = in.nextDouble();
            ItemType i = new ItemType();
            i.setName(name);
            i.setDeposit(deposit);
            i.setCostpershow(costpershow);
            i.display();
        }
        catch(NumberFormatException e)
        {
           System.out.println(" java.lang.NumberFormatException:");
        }
        catch(Exception ce)
        {
            ce.printStackTrace();
        }
    }
}
