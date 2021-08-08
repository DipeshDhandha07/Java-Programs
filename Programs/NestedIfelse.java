import java.io.*;
class NestedIfelse
{
    public static void main(String[] args)throws IOException
    {
      double a,b,c,d,e,per;
      BufferedReader p= new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter marks of 5 Subjects:");
      a=Double.parseDouble(p.readLine());
      b=Double.parseDouble(p.readLine());
      c=Double.parseDouble(p.readLine());
      d=Double.parseDouble(p.readLine());
      e=Double.parseDouble(p.readLine());
      per=(a+b+c+d+e)/500*100;
      
      if(per>=60)
      {
       System.out.println("Distinction");   
      }
      else
      {
          if(per>=50)
          {
            System.out.println("First Class");
          }
          else
          {
            if(per>=40)
            {
              System.out.println("Second Class");
            }
            else
            {
             System.out.println("Fail");   
            }    
          }    
      }      
    }
}