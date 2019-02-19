class Employee
{
 Protected String name;
 Protected int idNumber;
 Protected String address;
 Protected int phNumber;
 Protected int salary;


Public Employee()
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

class Manager extends Employee
{
protected string Department;
Department()
{
}
Department(final String Str,final int num,final string addr,final int ph,final int sal,final string dept)
{
super(Str,num,addr,ph,sal);
Department=dept;
}
void display();
super.display();
System.out.println("the department is:" +department);
}
}




