import java.util.Scanner;
class Student{
private String name;
private int roll_no;
private String branch;
private String result;
private int marks[]= new int[5];
private int sum=0;
float per;
Scanner s=new Scanner(System.in);
void input()
{
	
	System.out.println("enter student name:");
	name=s.next();
	System.out.println("enter roll_no:");
	roll_no=s.nextInt();
	System.out.println("enter student branch:");
	branch=s.next();

	

}


void cal()

{
for(int i=0;i<5;i++)
{
	System.out.println("enter marks"+ i );
	marks[i]=s.nextInt();
	sum=sum+marks[i];
}


	per=(float)(sum/500)*100;
	if(per>80)
	{
		System.out.println("distinction");
	}
	if(per>60 && per<79) {
		System.out.println(" pass");
	}
	else
	{
		System.out.println(" fail");
	}

}


void print()
{
	System.out.println(" name is"+name);
	System.out.println("age:"+roll_no);
	System.out.println("branch is"+branch);
	System.out.println(" percentage is"+per);
}
}

class StudentTest
{
	public static void main(String[] args)
		{
			Student objStudent = new Student();
			objStudent.input();
			objStudent.cal();
			objStudent.print();

//objStudent.per();
}
}

