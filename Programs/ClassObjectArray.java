import java.util.*;
class Account1 
{
    int a;
    int b;
    public void setData() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tEnter Employee Id : ");
        a = sc.nextInt();
        System.out.print("\n\tEnter Employee salary : ");
        b = sc.nextInt();
        sc.close();
    }
    public void showData() 
    {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}
class ObjectArray 
{
    public static void main(String[] args) 
    {
        Account1 obj[] = new Account1[3];
        for (int i = 0; i < 3; i++) 
        {
            obj[i] = new Account1();
            obj[i].setData();
        }
        for (int i = 0; i < 3; i++) 
        {
            obj[i].showData();
        }
    }
}