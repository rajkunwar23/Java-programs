import java.util.ArrayList;
class ArrayListDemo
{
String BookID,Bookname,author,publisher;
int quantity;

ArrayListDemo(String id,String n,String a,String p,int q)
{
this.BookID=id;
this.Bookname=n;
this.author=a;
this.publisher=p;
this.quantity=q;
}

 public String toString()
    {
        return "BookID: " + BookID + " |Bookname : " + Bookname + "|author:" + author + " |publisher : " + publisher + "|quantity:=" + quantity;
    }

public static void main(String []args)
{
ArrayListDemo A=new ArrayListDemo("001","To Kill a Mockingbird","Harper Lee","HarperCollins",1);
ArrayListDemo A1=new ArrayListDemo("002","1984","George Orwel","Penguin Books",1);

ArrayList <ArrayListDemo> AList=new ArrayList <ArrayListDemo>(4);
AList.add(A);
AList.add(A1);
System.out.println("Size of Book list:="+AList.size());
for(ArrayListDemo D:AList)
{
System.out.println("After adding Book data:="+D);
}
AList.remove(A);
for(ArrayListDemo D:AList)
{
System.out.println("After deleting Book data:="+D);
}
}
}

