
import java.util.*; 
class sort
{ 
    int x; 
    int y; 
    int i,j;
    Scanner input = new Scanner(System.in); 

    void setvaluel1()
    {
        System.out.println("Enter first element of pair");
        x= input.nextInt(); 
    }
    void setvaluel2()
    {
        System.out.println("Enter second element of pair");
        y= input.nextInt(); 
    }  
  
    int getvalue1()
    {
        return x;
    }
  
    int getvalue2()
    {
        return y;
    }

    void display(sort[] pr) 
    { 
        sort temp= new sort();

            for ( i = 0; i < 5; i++) 
        {
            for ( j = i + 1; j < 5; j++) 
            {
                if (pr[i].getvalue2() > pr[j].getvalue2()) 
                {
                    temp = pr[i];
                    pr[i] = pr[j];
                    pr[j] = temp;
                }
            }
        }
        for(i=0; i< 5; i++)
        {
            System.out.println("("+pr[i].getvalue1() +", "+ pr[i].getvalue2()+")"); 
        } 
    }

    public sort()      
    { 
        this.x = 0; 
        this.y = 0; 
    } 
} 
  
  
class Sort
{ 
    public static void main(String[] args) 
    { 
        Scanner num = new Scanner(System.in); 
  
        int i, x, y; 

        sort[] pr= new sort[5];
        sort pr1= new sort();

        for(i=0; i< 5; i++)
        {
            
                pr[i]= new sort();
                pr[i].setvalue1();
                pr[i].setvalue2(); 
            
        }

        System.out.println("After sorting with respect to second element of the pair");
        pr1.display(pr);
    } 
} 