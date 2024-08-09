import java.util.Scanner;
class SavingsAccount
{
static float annualInterestRate=0.04f;
private float savingsBalance; 

void calculateMonthlyInterest(float savingsBalance)
{
float MonthlyInterest;
MonthlyInterest=(annualInterestRate*savingsBalance)/12;
savingsBalance+=MonthlyInterest;
System.out.println("savings balance:="+savingsBalance);
}

static void modifyInterestRate(float rate)
{
 annualInterestRate=rate;
}

}

class Interest
{
public static void main(String []args)
{
float balance1,balance2;
Scanner sc=new Scanner(System.in);
System.out.print("enter your savings balance for saver1:=");
balance1=sc.nextFloat();


System.out.println();
System.out.println("for saver1");
SavingsAccount S1=new SavingsAccount();
S1.calculateMonthlyInterest(balance1);

System.out.print("enter your savings balance for saver2:=");
balance2=sc.nextFloat();

SavingsAccount S2=new SavingsAccount();
System.out.println("for saver2");
S2.calculateMonthlyInterest(balance2);

System.out.println("\n After modifying interest:");
System.out.println("for saver1");
S1.modifyInterestRate(0.05f);
S1.calculateMonthlyInterest(balance1);

System.out.println("for saver2");
S2.modifyInterestRate(0.05f);
S2.calculateMonthlyInterest(balance2);
}
}