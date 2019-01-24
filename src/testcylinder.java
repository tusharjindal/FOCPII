import java.util.*;
class circle{
	double radius,area;
	
	String color;
    circle()
    {
    	radius=1.0;
    	color= "red";

    }
    circle(double r)
    {
    	radius=r;
    }
    circle(double r, String str)
    {
        radius=r;
        color=str;
    }
    void setradius()
    {
    	Scanner input= new Scanner(System.in);
        System.out.println("enter the radius");
        radius=input.nextDouble();
    }
    void setcolor()
    {
    	Scanner input= new Scanner(System.in);
    	System.out.println("enter the color");
    	color=input.nextLine();
    }
    void setarea()
    {
    	area=radius*radius*3.14;
    }
    double getradius()
    {
         return radius;
    }
     String getcolor()
    {
    	return color;
    }
     double getarea()
    {
         return area;
    }
}
class cylinder extends circle
{
	double height,volume;
	cylinder()
	{  super();
        height=1.0;
	}
	cylinder(double r)
    {
    	radius=r;
    }
    cylinder(double r, double h, String str)
    {
        radius=r;
        height=h;
        color=str;
    }
    void setheight()
    {
    	Scanner input= new Scanner(System.in);
        System.out.println("enter the value of height");
        height=input.nextDouble();
    }
    void setvolume()
    {
    	volume= 3.14*radius*radius*height;
    }
    double getheight()
    {
    	return height;
    }
    double getvolume()
    {
        return volume;
    }
}
class testcylinder{
	public static void main(String args[])
	{
		cylinder c1;
		c1=new cylinder();
		c1.setradius();
		c1.setcolor();
		c1.setheight();
		c1.setvolume();
		c1.setarea();
		double d1=c1.getradius();
		String d2=c1.getcolor();
		double d3=c1.getvolume();
		double d6=c1.getheight();
		double d4=c1.getarea();
		double d5=c1.getvolume();
		System.out.println(d1+" "+d2+""+d3+""+d4+""+d5+""+d6);
	}
}