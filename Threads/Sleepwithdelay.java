// Use InterruptedException to delay output message by using Thread.sleep() 
class Hello1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Hello Dipesh");
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occurs");
		}
	}
}

class Sleepwithdelay 
{
	public static void main(String[] args)
	{
	    // will display Hello message with 5 sec delay()
		Hello1 h1= new Hello1();
		Hello1 h2= new Hello1();
		Hello1 h3= new Hello1();
		h1.start();
		h2.start();
		h3.start();
	}	
}
