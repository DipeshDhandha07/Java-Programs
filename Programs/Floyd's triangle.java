import java.util.Scanner;
class FloydTriangle
{
    public static void main(String args[])
     {
        int r, num = 1, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows for floyd's triangle:");
        r = input.nextInt();
        System.out.println("Floyd's triangle:");
        for (i = 1; i <= r; i++)
         {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(num + " ");
                // Incrementing the num value
                num++;
            }   
            System.out.println();
        }
    }
}