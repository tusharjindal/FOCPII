
import java.util.*;
public class WorstCasefn
{
public static void main(String[] args) 
{
  DisplayUnique();
}

static void DisplayUnique()
{
  Scanner num = new Scanner(System.in); 
  int[] arr = new int[5]; 
  int temp, i;

        System.out.println("enter an integer : ");
        for ( i = 0; i < 5; i++)
        {
          System.out.println("Enter element");
            temp = num.nextInt();
            if((temp <= 100 && temp >= 10))
            {
              for (int j = 0; j <i+1; j++)
              {
                if (arr[j] != temp)
                {
                  arr[i]= temp;
                   break;
                }
                else
                {
                  temp=0;
                  System.out.println("Duplicate value");
                }
                arr[i]= temp;
              }

              System.out.println("Unique numbers entered are:");

              for(int k= 0; k< 5; k++)
              { 
                System.out.print(arr[k] + " ");
              } 
              System.out.println(""); 
            }
        }
        System.out.println("\nWorst Case"); 
}
}