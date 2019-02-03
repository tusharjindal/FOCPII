
import java.util.*;
class Vehichle
{
	public void display()
	{
	System.out.println("This is a Vehichle");
	}
}
class Bike extends Vehichle
{
	public void display()
	{
	System.out.println("This is a Bike");
	}
}
class Car extends Vehichle
{
	public void display()
	{
	System.out.println("This is a Car");
	}
}
class VehichleTest
{
    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of wheels:");
    int option = input.nextInt();
    switch (option)
    {
     case 2:
     Bike obj = new Bike();
     obj.display();
     break;

     case 4:
     Car obj1 = new Car();
     obj1.display();
     break;

     default:
     Vehichle obj2 = new Vehichle();
     obj2.display();
     break;
    }
    }	
}