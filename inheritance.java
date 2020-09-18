package com.javatrain;
class Add{
    int 
    int add(int n1,int n2)
    {
        return(n1+n2);
    }
    void run()
    {
        System.out.println("this is add class");
    }
}
/*class Sub extends Add{
    void run2()
    {
        System.out.println("tis is sub class");
    }


}*/
public class Main {

    public static void main(String[] args) {
	Add s=new Add();
	System.out.println(Add(2,3));
	s.run();

    }
}
