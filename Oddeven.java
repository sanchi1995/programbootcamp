import java.util.Scanner;
public class Oddeven{
public static void main(String[] args)
{
	
System.out.println("enter the first number");
Scanner scan= new Scanner(System.in);
int num=scan.nextInt();

if(num%2==0)
System.out.println("the number is even:");
else
System.out.println("the number is odd");
}
}
