import java.util.Scanner;
public class Ifelseif{
public static void main(String[] args)
{
	
System.out.println("enter the first number");
Scanner scan= new Scanner(System.in);
int num1=scan.nextInt();
System.out.println("enter the second number");
int num2=scan.nextInt();
System.out.println("enter the second number");
int num3=scan.nextInt();

if(num1>num2 && num1>num3)
{
System.out.println("n1 is greatest:" +num1);
}
else if (num2>num3)
{
System.out.println("n2 is greatest:" +num2);
}
else
	System.out.println("num3 is greatest:" +num3);
}
}
