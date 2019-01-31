import java.util.*;
class point3D extends point2D
{
	float z;
	Scanner input = new Scanner(System.in);
	point3D()
	{
	float z= 0.0f;
	}
	/*point3D(point3D d1)
	{
	x = d1.x;
	y = d1.y;
	z = d1.z;
	}*/
	point3D(float x, float y, float z)
	{
	super();
	this.z=z;
	}
	void setz()
	{
	System.out.println("Enter the value of z: ");
	float z = input.nextFloat();
	}
	float getz()
	{
	return z;
	}
	public String toString()
    {
    return x+""+y+""+z;
    }
}