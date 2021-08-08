import java.net.*;
import java.io.*;
class ServerString 
{
	public static void main(String ar[])
	{
		try{
		ServerSocket ss=new ServerSocket(3333);
		System.out.println("waiting for Connection");
		Socket s1=ss.accept();
		System.out.println("Request Acceptted");

		BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
		String str=br.readLine();
		System.out.println("Msg from Client: "+str);
		
		String str1=str.toUpperCase();
		System.out.println("converted: "+str1);
		//BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dr=new DataOutputStream(s1.getOutputStream());
		
		dr.writeBytes(str1+"\n");
		}catch(Exception e)
		{
			System.out.println(""+e);
		}
	}
}