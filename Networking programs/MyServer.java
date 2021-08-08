import java.net.*;  
import java.io.*;  
class MyServer{  
public static void main(String args[])throws Exception
{  
	try{
	ServerSocket ss=new ServerSocket(3333);  
	System.out.println("Wating for connection");
	Socket s=ss.accept();  
	System.out.println("RequestAcceptted");

	//DataInputStream din=new DataInputStream(s.getInputStream());  
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  	BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));  
	String str1="",str2="";  
	
	while(!str1.equals("stop"))
	{  	
		System.out.println("inside");
		str1=br1.readLine();  
		

		System.out.println("client says: "+str1);  
		System.out.println("Server: Enter Data: ");
		str2=br.readLine();  
		dout.writeBytes(str2+"\n");  
		dout.flush();  
	}  
	//din.close();  
	s.close();  
	ss.close();  
	}catch(Exception e)
	{
		System.out.println(""+e);
	}
}}  