/* Synchronization in java is the capability to control the access of multiple threads to
 any shared resource. Java Synchronization is better option where we  want to allow only one 
threadto access the shared resource*/
class X extends Thread
{
	public synchronized void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread X:"+i);
		}
	}
}

class Y extends Thread
{
	public synchronized void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread Y:"+i);
		}
	}
}

class Z extends Thread
{
	public synchronized void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread Z:"+i);
		}
	}
}

class Sychronized_demo
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("Main starts:");
		X x1= new X();
		Y y1= new Y();
		Z z1= new Z();
		x1.start();
		y1.start();
		z1.start();
		System.out.println("Main ends:");
	}	
}
