import java.util.*;
class Fibonacci
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt(); 
        int a = 0, b = 1;
        System.out.println("First " + n + " terms: ");
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        sc.close();
    }
}