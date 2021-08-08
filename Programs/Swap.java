class Swap
{
    public static void main(String[] args)
    {
        int a= 5, b= 6;
        int temp= 0;
        System.out.println("Numbers before Swapping");
        System.out.println("a= "+a+" b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after Swapping");
        System.out.println("a= "+a+" b= "+b);
    }
}