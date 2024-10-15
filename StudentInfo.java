import java.io.*;
import java.util.Scanner;
class StudentInfo
{
public static void main(String []args)
{
int RollNo,age,weight;
long Mobno;
float height;
String Class,city;
Scanner sc=new Scanner(System.in);
System.out.println("Enter roll no:=");
RollNo=sc.nextInt();

System.out.print("Enter age:=");
age=sc.nextInt();

System.out.print("Enter height:=");
height=sc.nextFloat();

System.out.print("Enter weight:=");
weight=sc.nextInt();

System.out.print("Enter mobile no:=");
Mobno=sc.nextLong();

System.out.print("Enter city:=");
city=sc.next();

System.out.print("Enter class:=");
Class=sc.next();

FileOutputStream FOS;
DataOutputStream DOS;
try
{
FOS=new FileOutputStream("student.txt");
DOS=new DataOutputStream(FOS);
DOS.writeInt(RollNo);
DOS.writeInt(age);
DOS.writeInt(weight);
DOS.writeFloat(height);
DOS.writeLong(Mobno);
DOS.writeChars(Class);
DOS.writeChars(city);

DOS.close();
FOS.close();
}
catch(IOException ie)
{
ie.getMessage();
}
}
}
