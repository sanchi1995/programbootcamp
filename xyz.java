class Employee
{
 protected String name;
 protected int idNumber;
 protected String address;
 protected int phNumber;
 protected int salary;


public Employee()
{
}
Employee(final String Str,final int num,final String addr,final int ph,final int sal)
{
    name=Str;
    idNumber=num;
    address=addr;
    phNumber=ph;
	salary=sal;
}

void display()
{ 
System.out.println("the name is:" +name);
System.out.println("the name is:" +idNumber);
System.out.println("the name is:" +address);
System.out.println("the name is:" +phNumber);
System.out.println("the name is:" +salary);
}
}
class Manager extends Employee
{
protected String department;
Manager()
{
}
Manager(final String Str,final int num,final String addr,final int ph,final int sal,final String dept)
{
super(Str,num,addr,ph,sal);
department=dept;
}
void display()
{
super.display();
System.out.println("the department is:" +department);
}
}
 class developer extends Employee {
	 protected String designation;
	 protected String technology;
	
	 developer()
	 {
	 }
	 
developer(final String Str,final int num,final String addr,final int ph,final int sal,final String des,final String tech )
{
super(Str,num,addr,ph,sal);

designation=des;
technology=tech;
}
void display()
{
super.display();
System.out.println("the department is:" +technology);
}
 }

class xyz{
	
	
 public static void main(String[] args)
 {
	 Manager dpoj=new Manager("doll",122,"djd",1234643,123456,"IT");
	 dpoj.display();
	 developer devobj=new developer("riya",123,"jjws",9876543,78963,"uhkuh","java");
	 devobj.display();
 }
}



