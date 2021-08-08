// Multilevel Inheritance 
class A
{
    int a = 10;
    void show()
    {
        System.out.println("a= "+a);
    }    
}

class B extends A
{
    int b = 10;
    void showB()
    {
        System.out.println("b= "+b);        
    }
}

class Inheritance extends B
{
    public static void main(String[] args)
    {
        Inheritance c= new Inheritance();
        c.show();
        c.showB();
    }
}