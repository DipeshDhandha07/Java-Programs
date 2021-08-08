import java.io.*;
class ifelse
{
    public static void main(String[] args)throws IOException
    {
      System.out.println("If-else Statement");
      int a,b;  
      BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter first number:");
      a=Integer.parseInt(f.readLine());
      System.out.println("Enter second number:");
      b=Integer.parseInt(f.readLine());
      if(a>b)
      {
         System.out.println("a is greater than b");
      }
      else
      {
          System.out.println("b is greater than a");
      }
    }
}    