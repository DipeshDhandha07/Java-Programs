class Javatester 
{
    public int counter= 0;
    public static int staticCounter= 0;
    public void test()
    {
        counter++;
        staticCounter++;
    }    
    public static void main(String[] args)
    {
        Javatester t= new Javatester();        
        t.test();
        System.out.println("Counter: "+t.counter);
        System.out.println("Static Counter: " + Javatester.staticCounter);
    
        t.test();
        System.out.println("Counter: "+t.counter);
        System.out.println("Static Counter: " + Javatester.staticCounter);
    }    
}
