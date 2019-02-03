
import java.util.*;
public class array_sales
{
public static void main(String[] args) 
{
  Scanner num = new Scanner(System.in); 
  int[][] sales= new int[5][6];
  int i, j, sum=0;
  
  	for(i=0; i<4; i++)
    {
    	for(j=0; j<5; j++)
    	{
    		System.out.println("Enter sales by salesperson"+ i + "for product"+ j);
    		sales[i][j] = num.nextInt();
    	}
    }
    for(i=0; i<5; i++)
    {
    	for(j=0; j<5; j++)
    	{ 
    		sum+= sales[i][j];
    	}
    	sales[i][j] = sum;
    	sum=0;
    }
    for(j=0; j<5; j++)
    { 
     	for(i=0; i<4; i++)
    	{
    		sum+= sales[i][j];
    	}
    	sales[i][j] = sum;
    	sum=0;
    }
    for(i=0; i<5; i++)
    {
    	for(j=0; j<6; j++)
    	{
    		System.out.print(sales[i][j]+"  ");
       	}
       	System.out.println("");
    }
}
}