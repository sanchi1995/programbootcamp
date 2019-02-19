import java.util.Scanner;
public class Switchcase{
public static void main(String[] args)
{
	
System.out.println("enter the first number");
Scanner scan= new Scanner(System.in);
int num1=scan.nextInt();
System.out.println("enter the second number");
int num2=scan.nextInt();
char op;
System.out.println("enter the operator:");
op = scan.next().charAt(0);
switch(op)
{
case '+':

System.out.println("the answer:" +(num1+num2));
break;

case '-':
System.out.println("the answer:" +(num1-num2));
break;

case '*':
System.out.println("the answer:" +(num1*num2));
break;
default:
System.out.println("invalid operator" );
}
}
}