
import java.util.*;
public class arraycase
{
public static void main(String[] args) 
{
  Scanner num = new Scanner(System.in); 
  int[] arr = new int[5]; 
  int temp, i;

        System.out.println("Enter an integer : ");
        for ( i = 0; i < 5; i++)
        {
        temp = num.nextInt();
        if((temp <= 100 && temp >= 10))
        {
        for (int j = 0; j <= i; j++ )
        {
        if (temp != arr[j])
        {
        arr[i]= temp;
        break;
        }
        else
        {
        temp= 0;
        arr[i]=temp;
        System.out.println("Duplicate value");
        }
        }
        }
        else
        {
        temp = num.nextInt();
        }       
        }

    System.out.println("Unique numbers entered are:");
    for(int k= 0; k< 5; k++)
    { 
        System.out.print(arr[k] + " "); 
    } 
        System.out.println("\nWorst Case"); 
}
}