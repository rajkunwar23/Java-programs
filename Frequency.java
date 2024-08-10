import java.util.Scanner;
class Frequency
{
public static void main(String []args)
{
int []arr=new int[15];
Scanner sc=new Scanner(System.in);
System.out.print("Enter array elements:=");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}

int fr[]=new int[arr.length];
int visited=-1;

for(int i=0;i<arr.length;i++)
{
int count=1;
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
count++;
fr[j]=visited;
}
}
if(fr[i]!=visited)
{
fr[i]=count;
}
}

System.out.println("Frequencies of array elements:=");
for(int i=0;i<fr.length;i++)
{
if(fr[i]!=visited)
{
System.out.println(arr[i]+"="+fr[i]);
}
}

for(int i=0;i<fr.length;i++)
{
for(int j=i+1;j<fr.length;j++)
{
if(fr[i]>fr[j])
{
int temp=fr[i];
fr[i]=fr[j];
fr[j]=temp;
}
}
}

System.out.println("sorted array of frequencies:=");
for(int i=10;i<fr.length;i++)
{
System.out.print(fr[i]+" ");
}

}
}