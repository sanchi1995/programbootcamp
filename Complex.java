class Complex
{
double hours;
double minutes;
double seconds;
public Complex(double h,double m,double s)
{
hours =h;
minutes=m;
seconds=s;
}
void add (Complex obj2)
{
this.hours+=obj2.hours;
this.minutes+=obj2.minutes;
this.seconds+=obj2.seconds;
}
void display()
{
System.out.println(this.hours+ " :" + this.minutes+ " :" + this.seconds + ":");
if (seconds>=60)
	{
		this.minutes++;
		this.seconds=this.seconds-60;
		
	}
	if(minutes>=60)
	{
		this.hours++;
		this.minutes=this.minutes-60;
		
	}
	System.out.println(this.hours+ " :" + this.minutes+ " :" + this.seconds + ":");
}
public static void main(String[] args)
{
	Complex obj1=new Complex(10,7,10);
Complex obj2=new Complex(5,3,63);
obj1.add(obj2);
System.out.println("the addition of time is:");
obj1.display();
}
}