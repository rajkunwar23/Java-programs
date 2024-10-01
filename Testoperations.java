import MyMath.*;
import java.util.Scanner;
class Testoperations
{
public static void main(String []args)
{
double deg;
float x,y;
Trig T=new Trig();
Scanner sc=new Scanner(System.in);
System.out.print("Enter angle in degrees:=");
deg=sc.nextDouble();
T.sine(deg);
T.cosine(deg);
T.tangent(deg);
T.secant(deg);
T.cosecant(deg);
T.cotangent(deg);

System.out.print("Enter first num:=");
x=sc.nextInt();
System.out.print("Enter second num:=");
y=sc.nextInt();
Arithmetic A=new Arithmetic();
A.addition(x,y);
A.substraction(x,y);
A.multiplication(x,y);
A.division(x,y);

stat S=new stat();
int arr[]=new int[5];
System.out.print("Enter array elements:=");
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Min:="+S.getMin(arr,5));
System.out.println("Max:="+S.getMax(arr,5));
System.out.println("Average:="+S.getAvg(arr,5));
System.out.println("Count:="+S.getCount(arr,5));
}
}
