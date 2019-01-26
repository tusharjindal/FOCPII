import java.util.*;
class Circle
{
	private int r ;
	Circle()
	{
		this.r=1;
	}
	Circle(int radius)
	{
		this.r=radius;
	}
	double area()
	{ 
		double area;
		area = 3.14 * r* r;
		return area;
	}
	double circumference()
	{
		double circumference;
	circumference = 2*3.14*r;	
	return circumference;
	}
	public void display (double area, double circumference)
	{
		System.out.println("Area="+area);
		System.out.println("Circumference ="+circumference);
	}
}
class Circletest
{
	public static void main (String args[]) 
	{
		//int r = 1;
		Circle c1 = new Circle();
		c1.r=1;
		c1.display(c1.area(),c1.circumference());
			}
}

	