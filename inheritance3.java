package com.javatrain;
class Add{
    public Add() {
        System.out.println("hi");
    }
    Add(int i)
    {
        System.out.println("hello");
    }
    Add(int i,int i1)
    {
        System.out.println("hi hello");
    }
}
class Sub
{
    public Sub() {
        System.out.println("akshu");
    }
    Sub(int i)
    {
        super(i);
        System.out.println("swetha");
    }
   /* Sub(int i,int i1)
    {
        super(i,i1);
        System.out.println("sister");
    }
}*/
public class Main {

    public static void main(String[] args) {
        Sub s=new Sub(10);


    }
}
