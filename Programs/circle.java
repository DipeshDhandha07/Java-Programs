import java.io.*;
import java.util.*;
class circle 
{
    public static void main(String[] args)throws IOException
    {
      int r;
      double area,pi;
      Scanner a= new Scanner(System.in);
      System.out.print("Enter the radius:");
      r=a.nextInt();
      pi=3.14;
      area=pi*r*r;
      System.out.print("Area of circle:" +area);
      a.close();
    }
}