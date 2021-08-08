class Hello extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Hello Dipesh");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs");
		}
	}
}

class Sleep 
{
	public static void main(String[] args)throws Exception
	{
		// will display Hello 30 times,because 3 times new Hello() then ended with Goodbye
		Hello h1= new Hello();
		Hello h2= new Hello();
		Hello h3= new Hello();
		h1.start();
		h2.start();
		h3.start();
		Thread.sleep(500);
		System.out.println("Good bye");
	}	
}
