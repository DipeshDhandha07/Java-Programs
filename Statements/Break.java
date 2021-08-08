import java.io.*;
class Break
{
    public static void main(String[] args)throws IOException
    {
      System.out.println("Break Statement:");
      int i;
      for(i=1;i<=10;i++)
      {   
        if(i==7)
        {
         //breaking the loop
         break;
        }
        System.out.println(i);  
      }
    }
}