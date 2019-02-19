 public class Rectangle implements Shape
{	
	private double width;
	private double height;
	
	public Rectangle(double w, double h)
	{
		this.widh=w;
		this.height=h;
	}
 
 public void draw()
	{
		System.out.println("drawing rectangle");
	}
 public dopuble getArea()
	{
		return this.height*this.width;
	}
 }