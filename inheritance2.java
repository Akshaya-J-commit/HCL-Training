package com.javatrain;
class Add{
    public Add() {
        System.out.println("a");
    }
   int  Add(int i)
    {
        return(i);
    }

}
class Sub extends Add
{
    public int Sub(int i) {
        super(i);
        System.out.println("hi");
    }
}
public class Main {

    public static void main(String[] args) {
	Sub s=new Sub(10);

    }
}
