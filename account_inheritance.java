import java.util.Scanner;
package com.hcl2;
public class AccountDetails{
    protected String account_name;
    protected String account_number;
    protected String bank_name;
           public AccountDetails(String account_name,String account_number,String bank_name) {
               super();
               this.account_name=account_name;
               this.account_number=account_number;
               this.bank_name=bank_name;
           }
           public String getAccount_name(){
               return account_name;
           }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }
    public String getAccount_number(){
               return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public String getBank_name()
    {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }
}
public class CurrentAccount extends AccountDetails{
    private String tin_number;
    public CurrentAccount(String account_name,String account_number,String bank_name,String tin_number)
    {
        super(account_name,account_number,bank_name);
        this.tin_number=tin_number;
    }
    public String getTin_number(){
        return tin_number;
    }
    public void setTin_number(String tin_number){
        this.tin_number=tin_number;
    }
    protected void display() {
        System.out.println(super.account_name);
        System.out.println(super.account_number);
        System.out.println(super.bank_name);
        System.out.println(tin_number);
    }
}
public class SavingsAccount extends AccountDetails{
String organization_name;
public SavingsAccount(String account_name,String account_number,String bank_name,String organization_name)
{
    super(account_name,account_number,bank_name);
    this.organization_name=organization_name;
}
public String getOrganization_name(){
    return organization_name;
}
public String setOrganization_name(){
    this.organization_name=organization_name;
}
protected void display(){
    System.out.println(super.account_name);
    System.out.println(super.account_number);
    System.out.println(super.bank_name);
    System.out.println(organization_name);
}
}
public class Main {

    public static void main(String[] args) {
	int choice;
	Scanner input=new Scanner(System.in);
	System.out.println("Choose Account Type:");
	System.out.println("1.Current Account");
	System.out.println("2.Savings Account");
	choice=input.nextInt();
	input.nextLine();
	String output;
	output=input.nextLine();
	String s[10]=output.split(",");
	if(choice==1) {
        CurrentAccount ca = new CurrentAccount(s[0], s[1], s[2], s[3]);
        ca.display();
    }
	else if(choice==2){
    SavingsAccount sa=new SavingsAccount(s[0], s[1], s[2], s[3]);
    sa.display();
    }
}
