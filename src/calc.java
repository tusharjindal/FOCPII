
import java.util.*;
class Circle{
	double radius, area;
	String color;
	Scanner input = new Scanner(System.in);
	Circle()
	{
	this.radius = 1.0;
	}
	Circle(double r)
	{
	this.radius= r;
	}
	Circle(double r, String a)
	{
     this.radius=r;
     this.color = a;
	}
	void setradius()
	{
     System.out.println("Enter the value of radius: ");
     double radius = input.nextDouble();
	}
	double getradius()
	{
	return radius;
	}
	void setcolor()
	{
     System.out.println("Enter the color of circle : ");
     String color = input.nextLine();
	}
    String getcolor()
	{
	return color;
	}
	void setarea()
	{
	area = radius*radius*3.14;
	}
	double getarea()
	{
	return area;
	}
}
class Cylinder extends Circle
{ //subclass
   Scanner input = new Scanner(System.in);
	double height, volume;
	Cylinder()
	{
	super();
	height = 1;
	}
	Cylinder(double r)
	{
     radius = r;
	}
	Cylinder(double r, double h)
	{
     radius = r;
     height = h;
	}
	Cylinder(double r, double h, String a)
	{
	radius = r;
	height = h;
	color = a;
	}
	void setheight()
	{
    System.out.println("Eneter the value of height: ");
    double height = input.nextDouble();
	}
    double getheight()
    {
    return height;
    }
    void setvolume()
    {
    volume = radius*radius*height*3.14;
    }
    double getvolume()
    {
    return volume;
    }
}
class demo
{
	public static void main(String args[])
	{
    Cylinder obj = new Cylinder();
    obj.setradius();
    obj.setcolor();
    obj.setarea();
    obj.setheight();
    obj.setvolume();
    double d1 = obj.getradius();
    String d2 = obj.getcolor();
    double d3 = obj.getarea();
    double d4 = obj.getheight();
    double d5 = obj.getvolume();
    System.out.println("Color = " +d2);
    System.out.println("Area = " +d3);
    System.out.println("Volume = " +d5);
	}
}