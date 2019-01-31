import java.util.*;
class box
{   Scanner input = new Scanner(System.in);
	float width;
	float height;
	float depth;
	float volume;
	box()
	{
	width = 0.0f;
    height = 0.0f;
    depth = 0.0f; 
	}
	box(box c)
	{
	width = c.width;
	height= c.height;
    depth = c.depth;
	}
	box(float width, float height, float depth)
	{
	this.width = width;
	this. height= height;
    this.depth = depth;
	}
	void setheight()
	{
     System.out.println("Enter height");
     height =input.nextFloat();
	}
	float getheight()
	{
	return height;
	}
	void setdepth()
	{
     System.out.println("Enter depth");
     depth =input.nextFloat();
	}
	float getdepth()
	{
	return depth;
	}
	void setwidth()
	{
     System.out.println("Enter width");
     width =input.nextFloat();
	}
	float getwidth()
	{
	return width;
	}
	public void display1()
	{
	volume = depth*height*width;
	System.out.println("Volume = " +volume);
	}

}
class boxweight extends box
{   Scanner input = new Scanner(System.in);
	float weight;
	boxweight()
	{
	float weight =0.0f;
	}
	boxweight(boxweight c1)
     {
     width = c1.width;
	height= c1.height;
    depth = c1.depth;
     weight = c1.weight;
     }
    //boxweight(float weight)
    //{
    //this.weight=weight;
    //}
    boxweight(float height,float width, float depth, float weight)
    {
    super();
    this.weight = weight;
    }
    void setweight()
	{
     System.out.println("Enter weight");
     weight =input.nextFloat();
	}
    float getweight()
	{
	return weight;
	}
    public void display2()
    {
    System.out.println("Weight = " +weight);
    }
    
}
class boxweightdemo{
	public static void main(String args[])
	{
		//float volume, height, depth, width, weight;
	box c = new box();
	c.setwidth();
	c.setdepth();
	c.setheight();
    boxweight c1 = new boxweight();
	c1.setweight();
	//c1.getweight();
   c1.display2();
   c.display1();
	}
}