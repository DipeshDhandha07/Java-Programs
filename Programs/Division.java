import java.util.Scanner;
class Division
{
    public static void main(String[] args)
    {
      int a,b,div;
      Scanner d= new Scanner(System.in);
      System.out.println("Enter first number:");
      a=d.nextInt();
      System.out.println("Enter second number:");
      b=d.nextInt();
      div=a/b;
      System.out.println("Division of numbers is:"+div);
      d.close();
    }    
}