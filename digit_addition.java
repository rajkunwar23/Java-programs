import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
	{ 
		int number;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter your number:=");
                number=sc.nextInt(); 
		String string_num = Integer.toString(number); 
		int len = string_num.length(); 
		String add = ""; 

		for (int i = 0; i < len; i++) 
                { 
		  add = add.concat("1"); 
		}
 
		int str_num = Integer.parseInt(add); 
		System.out.println(number + str_num); 
	} 
}
