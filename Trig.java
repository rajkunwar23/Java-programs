
package MyMath;
interface operations
{
void sine(double deg);
void cosine(double deg);
void tangent(double deg);
void secant(double deg);
void cosecant(double deg);
void cotangent(double deg);
}



public class Trig implements operations
{
public void sine(double deg)
{ 
double radians = Math.toRadians(deg); 
double sinValue = Math.sin(radians); 
System.out.println("sin(" + deg + ") = " + sinValue); 
}

public void cosine(double deg)
{
double radians = Math.toRadians(deg); 
double cosValue = Math.cos(radians); 
System.out.println("cos(" + deg + ") = " + cosValue); 
}

public void tangent(double deg)
{
double radians = Math.toRadians(deg); 
double tanValue = Math.tan(radians); 
System.out.println("tan(" + deg + ") = " + tanValue); 
}


public void secant(double deg)
{
double radians = Math.toRadians(deg); 
double cosValue = Math.cos(radians); 
double secValue = 1/cosValue; 
System.out.println("sec(" + deg + ") = " + secValue); 
}

public void cosecant(double deg)
{
double radians = Math.toRadians(deg); 
double sinValue = Math.sin(radians); 
double cosecValue=1/sinValue;
System.out.println("cosec(" + deg + ") = " + cosecValue); 
}


public void cotangent(double deg)
{
double radians = Math.toRadians(deg); 
double tanValue = Math.tan(radians); 
double cotValue=1/tanValue;
System.out.println("cot(" + deg + ") = " + cotValue); 
}
}