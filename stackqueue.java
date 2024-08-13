import java.util.Scanner;
interface stack
{
void push(int num);
int pop();
void display1();
}

interface queue
{
void enqueue(int num);
int dequeue();
void display2();
}

class stackqueueop implements stack,queue
{
int []stack;
int []queue;
int MAXSIZE,top,front,rear;

stackqueueop(int maxsize)
{
this.MAXSIZE=maxsize;
this.stack=new int[MAXSIZE];
this.top=-1;
this.queue=new int[MAXSIZE];
this.front=-1;
this.rear=-1;
}

public void push(int num)
{
if(top==MAXSIZE-1)
{
System.out.println("stack overflow");
return;
}
else
{
this.stack[++top]=num;
}
}

public int pop()
{
int val;
if(top==-1)
{
System.out.println("stack underflow");
return 0;
}
else
{
val=this.stack[top--];
}
return val;
}

public void display1()
{
if(top==-1)
{
System.out.println("stack underflow");
return;
}
else
{
System.out.println("stack elements:=");
for(int i=top;i>=0;i--)
{
System.out.println(stack[i]);
}
}
}

public void enqueue(int num)
{
if(rear==MAXSIZE-1)
{
System.out.println("queue overflow");
return;
}
else
{
front=0;
queue[++rear]=num;
}
}

public int dequeue()
{
int val;
if(front==-1)
{
System.out.println("queue underflow");
return 0;
}
else
{
val=queue[front];
if(front==rear)
{
front=rear=-1;
}
else
{
front++;
}
}
return val;
}

public void display2()
{
if(front==-1&&rear==-1)
{
System.out.println("queue underflow");
return;
}
else
{
System.out.println("queue elements:=");
for(int i=front;i<=rear;i++)
{
System.out.println(queue[i]);
}
}

}
}

class Main
{
public static void main(String []args)
{
int num,maxsize,choice,choice1,choice2;
Boolean flag1=true;
Boolean flag2=true;
Scanner sc=new Scanner(System.in);

System.out.print("Enter the max size of array:=");
maxsize=sc.nextInt();
stackqueueop o=new stackqueueop(maxsize);

while(true)
{
System.out.println("1]stack 2]queue 3]exit");
System.out.println("enter your choice:=");
choice=sc.nextInt();
switch(choice)
{
case 1:
       while(flag1)
       {
        System.out.println("1]push 2]pop 3]display 4]exit");
        System.out.println("enter your choice:=");
        choice1=sc.nextInt();
        switch(choice1)
        {
         case 1:System.out.print("Enter the element to add:=");
                num=sc.nextInt();
                o.push(num);
                break;

        case 2:System.out.println("popped value:="+o.pop());
               break;

        case 3:o.display1();
               break;
    
        case 4:System.exit(0);
               break;

        default:System.out.println("make proper selection");

        }
       }
       break;

case 2:
       while(flag2)
       {
        System.out.println("1]enqueue 2]dequeue 3]display 4]exit");
        System.out.println("enter your choice:=");
        choice2=sc.nextInt();
        switch(choice2)
        {
         case 1:System.out.print("Enter the element to add:=");
                num=sc.nextInt();
                o.enqueue(num);
                break;

        case 2:System.out.println("popped value:="+o.dequeue());
               break;

        case 3:o.display2();
               break;
    
        case 4:System.exit(0);
               break;

        default:System.out.println("make proper selection");
        }
       }
       break;

case 3:System.exit(0);
       break;

default:System.out.println("make proper selection");
}
}

}
} 

       

