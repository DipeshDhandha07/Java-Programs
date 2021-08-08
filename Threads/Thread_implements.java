class P implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread P:"+i);
		}
	}
}

class S implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread S:"+i);
		}
	}
}

class R implements Runnable
{
	public void run()
	{
		
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread R:"+i);
		}
	}
}

class Thread_implements 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Main starts:");
		Thread p1= new Thread(new P());
		Thread s1= new Thread(new S());
		Thread r1= new Thread(new R());
		p1.start();
		s1.start();
		r1.start();
		System.out.println("Main ends:");
	}	
}