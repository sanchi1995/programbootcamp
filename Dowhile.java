import java.util.Scanner;
public class Dowhile{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String guess;
do
{
System.out.println("guess my name:");
guess= s.nextLine();
}
while(!"raj".equals(guess));
System.out.println("congractulations u guessed my name");
}
}