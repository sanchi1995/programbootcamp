import java.util.Scanner;
public class Array{
public static void main(String[] args)
{
int[] numbers={8,10,3,4,5,1};
int i;
System.out.println("total number of elements in an array is:" +numbers.length);
System.out.println("first element in an array is:" +numbers[0]);
System.out.println(" last element in an array is:" +numbers[numbers.length-1]);
int sum=0;
for(i=0;i<numbers.length;i++)
{
sum+=numbers[i];
}
System.out.println("the sum of array elements:" +sum);
}
}

