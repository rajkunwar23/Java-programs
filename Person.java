import java.util.Scanner;
class Person
{
String name;
int birthdate;
int height,weight,count=0;
String address;

Person(String n,int b,int w,int h,String a)
{
this.name=n;
this.birthdate=b;
this.height=h;
this.weight=w;
this.address=a;
}

void showPerson()
{
System.out.println("Person name:="+name);
}


void calculateAge()
{
for(int i=birthdate;i<2024;i++)
{
count++;
}
System.out.println("Person age is:="+count);
}

}

class Student extends Person
{
int roll_no,count;
int marks[]=new int[5];

Student(String n,int b,int w,int h,String a,int m[],int r)
{
super(n,b,w,h,a);
this.marks=m;
this.roll_no=r;
}

void calculateAvg()
{
for(int i=0;i<5;i++)
{
count+=marks[i];
}
float avg=count/5;
System.out.println("average of marks of student:="+avg);
}

}

class Employee extends Person
{
String emp_id;
int salary;

Employee(String n,int b,int w,int h,String a,String e,int s)
{
super(n,b,w,h,a);
this.emp_id=e;
this.salary=s;
}

void calculateTax()
{
if(salary<=300000)
{
System.out.println("Tax payable:=NIL");
}
else if(salary>=300000 && salary<=700000)
{
System.out.println("Tax payable:="+0.05f*salary);
}
else if(salary>=700000 && salary<=1000000)
{
System.out.println("Tax payable:="+0.1f*salary);
}
else if(salary>=1000000 && salary<=1200000)
{
System.out.println("Tax payable:="+0.15f*salary);
}
else if(salary>=1200000 && salary<=1500000)
{
System.out.println("Tax payable:="+0.20f*salary);
}
else if(salary>=1500000)
{
System.out.println("Tax payable:="+0.30f*salary);
}
}

}

class TestInheritance
{
public static void main(String []args)
{
int b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your birthyear:=");
b=sc.nextInt();

int m[]=new int[5];

System.out.print("Enter your marks:=");
for(int i=0;i<5;i++)
{
m[i]=sc.nextInt();
}
Student S=new Student("x",b,0,0,"y",m,1);
S.calculateAge();
S.calculateAvg();

int s;
System.out.print("Enter Employee salary:=");
s=sc.nextInt();
Employee E=new Employee("x",b,0,0,"y","abc123",s);
E.calculateAge();
E.calculateTax();
}
}

