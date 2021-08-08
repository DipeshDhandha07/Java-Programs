import java.io.*;
import java.util.*;
class PrimeNo
{
    public static void main(String[] args)throws IOException
    {
        int w;
        Scanner pr = new Scanner(System.in);
        System.out.println("Enter a Number:");
        w = pr.nextInt();
        int n;
        int count=0;
        for(n=1;n<=w/2;n++)
        {
           if(w%n==0)
           {
             count=count+1;
           }
           pr.close();  
        }
           if(count==1)           
              System.out.println("Prime No");
           else
            System.out.println("Not a Prime No");   
    }
}
