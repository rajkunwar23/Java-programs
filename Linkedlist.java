import java.util.Scanner;
public class Linkedlist
{
Node head;
static class Node
{
int num;
Node next;
Node(int num)
{
this.num=num;
this.next=null;
}
}

void add_at_begin(Linkedlist L,int num)
{
Node new_node=new Node(num);
if(L.head==null)
{
L.head=new_node;
}
else
{
Node temp= L.head; 
L.head=new_node;
head.next=temp;
}
}

void add_at_end(Linkedlist L,int num)
{
Node new_node=new Node(num);
if(L.head==null)
{
System.out.println("list is not created");
return;
}
else
{
Node current=L.head;
while(current.next!=null)
{
current=current.next;
}
current.next=new_node;
}

}

void add_at_mid(Linkedlist L,int num,int position)
{
int count;
Node new_node=new Node(num);
if(L.head==null)
{
System.out.println("list is not created");
return;
}
else
{
Node current=L.head;
for(count=0;count<position-1;count++)
{
if(current.next==null)
{
System.out.println("insufficient nodes");
return;
}
else
{
current=current.next;
}
}
new_node.next=current.next;
current.next=new_node;
}
}


void del_at_begin(Linkedlist L)
{
if(L.head==null)
{
System.out.println("List is not created");
return;
}
else
{
Node temp=L.head;
L.head=temp.next;
}

}


void del_at_end(Linkedlist L)
{
Node previous=null;
if(L.head==null)
{
System.out.println("List is not created");
return;
}
else
{
Node current=L.head;
while(current.next!=null)
{
previous=current;
current=current.next;
}
previous.next=null;

}
}

void del_at_mid(Linkedlist L,int position)
{
int count;
Node previous;
if(L.head==null)
{
System.out.println("List is not created");
return;
}
else
{
Node current=L.head;
for(count=0;count<position-1;count++)
{
if(current.next==null)
{
System.out.println("insufficient nodes");
return;
}
else
{
previous=current;
current=current.next;
}
previous.next=current.next;
}
}

}

void Display(Linkedlist L)
{
Node current=L.head;
if(L.head==null)
{
System.out.println("List is not created");
return;
}
else
{
while(current!=null)
{
System.out.println(current.num);
current=current.next;
}
}
}

}



class SinglyLinkedlist
{
public static void main(String []args)
{
int num,position,choice;
Linkedlist L=new Linkedlist();
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("LinkedList operations:=\n1]add at begin\n2]add at end\n3]add at mid\n4]delete at begin\n5]delete at end\n6]delete at mid\n7]Display\n8]close");
System.out.print("Enter your choice:=");
choice=sc.nextInt();

switch(choice)
{
case 1:System.out.println("Enter element to add:=");
       num=sc.nextInt();
       L.add_at_begin(L,num);
       break;

case 2:System.out.println("Enter element to add:=");
       num=sc.nextInt();
       L.add_at_end(L,num);
       break;

case 3:System.out.println("Enter element to add:=");
       num=sc.nextInt();
       System.out.println("Enter position of the element to add:=");
       position=sc.nextInt();
       L.add_at_mid(L,num,position);
       break;

case 4:L.del_at_begin(L);
       break;

case 5:L.del_at_end(L);
       break;

case 6:System.out.println("Enter position of the element to delete:=");
       position=sc.nextInt();
       L.del_at_mid(L,position);
       break;

case 7:L.Display(L);
       break;

case 8:System.exit(0);

default:System.out.println("Make proper selection");
}
}
}
}