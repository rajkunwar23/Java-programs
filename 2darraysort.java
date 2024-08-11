class twoDarray
{
int [][]arr={{ 11, 39, 27, 42 },  
               { 10, 90, 93, 91 },  
               { 56, 89, 54, 78 },  
               {  20, 65, 24, 64 } }; 

void print()
{
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}


void sort()
{
int n=arr.length;
int temp;

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
for(int k=0;k<n;k++)
{
for(int l=0;l<n;l++)
{
if(arr[i][j]<arr[k][l])
{
temp=arr[i][j];
arr[i][j]=arr[k][l];
arr[k][l]=temp;
}
}
}
}
}

}

}

class Main
{
public static void main(String []args)
{
twoDarray s=new twoDarray();
System.out.print("2D array:=");
s.print();
s.sort();
System.out.print("sorted 2D array:=");
s.print();
}
}