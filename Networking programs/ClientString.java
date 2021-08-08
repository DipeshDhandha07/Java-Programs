import java.net.*;
import java.io.*;
class ClientString 
{
	public static void main(String ar[])
	{
		try{
		Socket s=new Socket("127.0.0.1",3333);
		System.out.println("Client sending request");
		System.out.println("Connected Successfully");
		System.out.println("Enter String :");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dr=new DataOutputStream(s.getOutputStream());
		String str=br.readLine();
		dr.writeBytes(str+"\n");
		
		BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str1=br1.readLine();
		System.out.println("Msg from Server: "+str1);
		}catch(Exception e)
		{
			System.out.println(""+e);
		}
	}
}