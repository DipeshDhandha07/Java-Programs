import java.io.*;
class DuckNo
{
    public static void main(String[] args)throws IOException
    {
        int n;
        int d=0;
        int c=0;
        BufferedReader du=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number:");
        n=Integer.parseInt(du.readLine());
        while(n>0)
        { 
          d=n%10;
          if(d==0)
          {
            c=c+1;
            d++;
          }
          n=n/10;
          if(d!=0 && c>0)
            System.out.println("It is a Duck No");
          else
            System.out.println("It is not a Duck No"); 
        }
    }
}