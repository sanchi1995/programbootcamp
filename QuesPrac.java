
public class Animal
{
	class Tiger extends Animal
	{
		public class QuesPrac
		{
			public void m1(Animal a)
			{
			System.out.println("Animal");
			}
			public void m1(Tiger d)
			{
			System.out.println("Tiger");
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test t=new Test();
		Animal a=new Animal();
		t.m1(a);
		Animal a1=new Tiger();
		t.m1(a1);
		

	}

}
