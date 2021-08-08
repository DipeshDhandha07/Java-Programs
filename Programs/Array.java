import java.util.*;
class Array 
{
    public static void main(String[] args)
     {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Enter number:");
            a[i] = sc.nextInt();
        }
        // access elements of tha array
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Element at index " + i + ": " + a[i]);
        }
        sc.close();
    }
}