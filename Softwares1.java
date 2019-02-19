package oracle;//creating a package

public class Softwares 
{
public Softwares()
{
	
}
public final void printSoftware()
	{
		int i;
		String [] arrOracle= {"Oracle8i","Oracle9i","Oracle10G"};
		for(i=0;i<3;i++)
		{
			System.out.println(arrOracle[i]);
		}
	}
}

package sun;//creating a package

public class Softwares1
{
	public Softwares1()
	{
		
	}
	public final void listSoftware()
	{
		int i;
		String [] arrsun= {"JCreatot","JBuilder","Jacobe"};
		for(i=0;i<3;i++)
		{
			System.out.println(arrsun[i]);
		}
	}
}

//write these programmes in different files..................
import oracle.Softwares;
import sun.Softwares1;

public class SoftwareList 
{
	protected SoftwareList()
	{
		
	}

	public static void main(final String[] args)
	{
		// TODO Auto-generated method stub
		sun.Softwares1 objsun=new sun.Softwares1();
		objsun.listSoftware();
		oracle.Softwares objOracle=new oracle.Softwares();
		objOracle.printSoftware();

	}

}
