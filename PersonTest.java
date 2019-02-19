import java.util.Scanner;
class Person{
private String name;
private int age;
private String consituency;
Person()
{
	System.out.println("voter eligiblity app");
	age=0;
	name="";
	consituency="noida";
	Scanner s=new Scanner(System.in);
}
Person(String n,int a)
{
	name=n;
	age=a;
}
Person(String n,int a,String c)
{
	name=n;
	age=a;
	consituency=c;
}
public void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter your name:");
name=s.next();
System.out.println("enter your age:");
age=s.nextInt();
}
void print()
{
System.out.println(" name is"+name);
System.out.println("age:"+age);
System.out.println("consituency is:" +consituency);
}
void eligible()
{
	if(age<18)
	{
		System.out.println(" not eligible");
	}
	else 
	{
		System.out.println(" eligible");
}

}

}

class PersonTest
{
public static void main(String[] args)
{
Person objPerson = new Person();
Person objPerson1=new Person("sanchita",50);
Person objPerson2=new Person("sanchi",30,"delhi");
objPerson.input();
objPerson.eligible();
objPerson.print();
objPerson1.eligible();
objPerson1.print();
objPerson2.eligible();
objPerson2.print();


}

}

