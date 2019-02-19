import java.util.Scanner;
public class Usingbreak{
public static void main(String[] args)
{
int a,sum=0;
System.out.println("enter a number 1");
Scanner scan=new Scanner(System.in);
for(int i=1;i<=10;i++)
{
	a=scan.nextInt();
if(a<=0)
continue;
sum=sum+a;	
}
System.out.println(sum);
}
}




