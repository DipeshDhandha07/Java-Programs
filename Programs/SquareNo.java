import java.util.*;
class SqaureNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int i=1;
        System.out.println("Square is:");
        while(i<=n)
        {
            System.out.println(+(i*i));
            i++;
        }        
        sc.close();                                                         
    }
}    