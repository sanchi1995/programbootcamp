import java.util.Scanner;
public class Series{
public static void main(String[] args)
{
int i=1,n=10,sum=0;
while(i<=n)
{
	sum=sum+i;
	i=i+1;
}

System.out.println("the answer:" +sum);
}
}