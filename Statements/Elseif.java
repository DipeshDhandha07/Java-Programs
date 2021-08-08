import java.io.*;
class Elseif
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("Elseif statement:");
        int a,b;
        BufferedReader el= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        a=Integer.parseInt(el.readLine());
        System.out.println("Enter second number:");
        b=Integer.parseInt(el.readLine());
        if(a>b)
        {
            System.out.println("a is greater than b");
        } 
        else if(a==b)
        {
            System.out.println("a is equal to b");
        } 
        else
        {
            System.out.println("b is greater than a");
        }    
    }
}    