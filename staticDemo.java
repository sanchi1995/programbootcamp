class StaticDemo {
static int count;
StaticDemo()
{
count=count+1;
}
static void display()
{
System.out.println("the no. of objects created is:"+count);
}
public static void main(String[] args)
{
StaticDemo s1=new StaticDemo();
StaticDemo s2=new StaticDemo();
StaticDemo s3=new StaticDemo();
s3.display();
}
}