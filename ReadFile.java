import java.io.*;
import java.util.Scanner;
class ReadFile
{
public static void main(String args[])
{
String Filename,msg;
Scanner sc=new Scanner(System.in);
System.out.print("Do you want to add contents to a file?:=");
msg=sc.next();
if(msg.equals("yes"))
{
System.out.print("Enter filename:=");
Filename=sc.next();
String line;

FileOutputStream FOS;
DataOutputStream DOS;
try
{
FOS=new FileOutputStream(Filename,true);
DOS=new DataOutputStream(FOS);

System.out.print("Enter text to add:=");
line=sc.next();

DOS.writeChars(line);
DOS.close();
FOS.close();
}
catch(IOException ie)
{
ie.getMessage();
}

String Text;
FileInputStream FIS;
DataInputStream DIS;
try
{
FIS=new FileInputStream(Filename);
DIS=new DataInputStream(FIS);
Text=DIS.readLine();
System.out.println(Text);
DIS.close();
FIS.close();
}
catch(IOException ie)
{
ie.getMessage();
}

}
else
{
System.out.println("as per ur choice no contents to display!!!");
}

}
}