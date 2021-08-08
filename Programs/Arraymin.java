import java.util.*;
class Arraymin
{
    public static void main(String[] args) 
    {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        for (int i = 0; i < 5; i++) 
        {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 0; i < 5; i++)
        {
            if (a[i] < min) 
            {
                min = a[i];
            }
        }
        System.out.println("Minimum number is " + min);
        sc.close();
    }
}