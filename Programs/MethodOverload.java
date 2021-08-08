import java.util.*;
class MethodOverload
{
    void display(int a)
    {
        System.out.println("Arguments: "+a);
    }    
    void display(int a,int b)
    {
        System.out.println("Arguments: "+a+" and "+b);        
    }
    public static void main(String[] args)
    {
        MethodOverload m=new MethodOverload();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=sc.nextInt();
        System.out.println("Enter second number: ");
        int y=sc.nextInt();
        m.display(x);
        m.display(x,y);
        sc.close();       
    }
}