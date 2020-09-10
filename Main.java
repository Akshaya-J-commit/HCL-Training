package com.javatrain;
class Student{
    int r;
    String n;
   static String principal="swetha";
    Student(int r,String n,String principal)
    {
       this.r=r;
        this.n=n;
        this.principal=principal;
    }
    void disp()
    {
        System.out.println(r+" "+n+" "+principal);
    }
}

public class Main {

    public static void main(String[] args) {
	Student in=new Student(1,"aks","swetha");
	Student in2=new Student(2,"swe","swetha");
	in.disp();
	in2.disp();
    }
}
