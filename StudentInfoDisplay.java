import java.io.*;
class StudentInfoDisplay
{
public static void main(String []args)
{
int RollNo,age,weight;
long Mobno;
float height;
String Class,city;

FileInputStream FIS;
DataInputStream DIS;
try
{
FIS=new FileInputStream("student.txt");
DIS=new DataInputStream(FIS);

RollNo=DIS.readInt();
age=DIS.readInt();
weight=DIS.readInt();
height=DIS.readFloat();
Mobno=DIS.readLong();
Class=DIS.readLine();
city=DIS.readLine();

System.out.println("roll no:="+RollNo);
System.out.println("age:="+age);
System.out.println("height:="+height);
System.out.println("weight:="+weight);
System.out.println("mobile no:="+Mobno);
System.out.println("class:="+Class);
System.out.println("city:="+city);

DIS.close();
FIS.close();
}
catch(IOException ie)
{
ie.getMessage();
}
}
}