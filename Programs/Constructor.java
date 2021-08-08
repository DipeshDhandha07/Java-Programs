class Rect
{
    int a;
    int b;
    // default constructor
    Rect()
    {
          a=2;
          b=3;
    }
    void display()
    {
        //Displaying value of variables of a and b
        System.out.println("Area of rectangle: "+(a*b));
    }    
}
class Constructor
{
    public static void main(String[] args)
    {
        Rect ob=new Rect();
        ob.display();
    }
}
