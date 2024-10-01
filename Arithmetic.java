package MyMath;
interface operations
{
void addition(float x,float y);
void substraction(float x,float y);
void multiplication(float x,float y);
void division(float x,float y);
}
public class Arithmetic implements operations
{
public void addition(float x,float y)
{
float add=x+y;
System.out.println("\n sum of two float values is:="+add);
}

public void substraction(float x,float y)
{
float sub=x-y;
System.out.println("\n difference of two float values is:="+sub);
}

public void multiplication(float x,float y)
{
float product=x*y;
System.out.println("\n product of two float values is:="+product);
}

public void division(float x,float y)
{
float div=x%y;
System.out.println("\n remainder of two float values is:="+div);
}
}