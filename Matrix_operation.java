import java.util.Scanner;
class matrix
{
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];

Scanner sc=new Scanner(System.in);
void input()
{
System.out.print("Enter elements of array-a:=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.print("Enter elements of array-b:=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
b[i][j]=sc.nextInt();
}
}

}

void show()
{
System.out.println("array-a:=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

System.out.println("array-b:=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}


}


void addition()
{
System.out.println("matrix addition:=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}

void substraction()
{
System.out.println("matrix substraction:=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=a[i][j]-b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}

void multiplication()
{
System.out.println("matrix multiplication:=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=0;
for(int k=0;k<2;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}

}

class Matrix_operation
{
public static void main(String []args)
{
matrix m=new matrix();
m.input();
m.show();
m.addition();
m.substraction();
m.multiplication();
}
}



