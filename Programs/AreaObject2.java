//Second method
import java.util.*;
class Area 
{
    int l,b;
    void input(int a, int b1)
     {
        l = a;
        b = b1;
     }

    void display() 
    {
        System.out.println("Area of rectangle is: "+(l*b));
    }

    public static void main(String ar[]) 
    {
        Area A = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int len = sc.nextInt();
        System.out.println("Enter breadth:");
        int br = sc.nextInt();
        A.input(len, br);
        A.display();
        sc.close();
    }
}
