import java.util.*;
class point2D
{   Scanner input = new Scanner(System.in);
	float x;
	float y;
    point2D()
    {
     float x = 0.0f;
     float y = 0.0f;
    }
    /*point2D(point2D d)
    {
    x = d.x;
    y = d.y;
    }*/
    point2D(float x, float y)
    {
    this.x=x;
    this.y=y;
    }
    void setx()
    {
    System.out.println("Enter the value of x: ");
    float x = input.nextFloat();
    }
    float getx()
    {
     return x;
    }
    void sety()
    {
    System.out.println("Enter the value of y: ");
    float y = input.nextFloat();
    }
    float gety()
    {
     return y;
    }
    public String toString()
    {
    return x+""+y;
    }
    }