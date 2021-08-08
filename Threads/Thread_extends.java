class A extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread A:"+i);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread B:"+i);
		}
	}
}

class C extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread C:"+i);
		}
	}
}

class Thread_extends 
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("Main starts:");
		A a1= new A();
		B b1= new B();
		C c1= new C();
		a1.start();
		b1.start();
		c1.start();
		System.out.println("Main ends:");
	}	
}
