class Logical 
{
  public static void main(String[] args)
  {
    int a, b;
    a= 10;
    b= 20;
    System.out.println(a>b || a<b);
    System.out.println(a>b && a<b);//AND operator -return true if both operands are non-zero
    System.out.println(!(a>b)); //OR operator -return true if either of operand is non-zero    
    System.out.println(!(a==b)); //!= statements return true if they sre unequal
  }    
}
