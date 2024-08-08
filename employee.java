import java.util.Scanner;
class employee
{
String first_name,last_name;
double monthly_salary,raise;

employee()
{
this.first_name=null;
this.last_name=null;
this.monthly_salary=0;
}

void setfname(String f)
{
first_name=f;
}

void setlname(String l)
{
last_name=l;
}

void setsalary(double s)
{
monthly_salary=s;
}

String getfname()
{
return first_name;
}

String getlname()
{
return last_name;
}

double getsalary()
{
return monthly_salary;
}

void setraise(double r)
{
raise=r;
}

double getraise()
{
return raise=monthly_salary*0.10;
}

}

class EmployeeSalary
{
public static void main(String []args)
{
String f,l;
double s;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first name:=");
f=sc.next();

System.out.print("Enter last name:=");
l=sc.next();

System.out.print("Enter the salary:=");
s=sc.nextDouble();

employee e=new employee();
e.setfname(f);
e.setlname(l);
e.setsalary(s);
System.out.println("first name:="+e.getfname());
System.out.println("last name:="+e.getlname());
System.out.println("monthly salary:="+e.getsalary());
System.out.println("yearly salary:="+(e.getsalary()*12));

double monthly_salary=e.getsalary()+e.getraise();
System.out.println("Raised monthly salary:="+monthly_salary);
System.out.println("Raised yearly salary:="+(e.getsalary()+e.getraise())*12);



}
}



