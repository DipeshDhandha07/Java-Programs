import java.net.*;  
import java.io.*;  
class MyClient
{  
  public static void main(String args[])throws Exception   
  {  
             try
             {
	Socket s=new Socket("localhost",3333);  
	System.out.println("Sending Request");
	System.out.println("Connected Suuceessfully");

	DataInputStream din=new DataInputStream(s.getInputStream());  
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  	BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));  
	String str="",str2="";  
	while(!str.equals("stop"))
	{  
		System.out.println("Clinet: Enter Data: ");
		str=br.readLine();  
		dout.writeBytes(str+"\n");  
		dout.flush();  
		str2=br1.readLine();  
		System.out.println("Server says: "+str2);  
	}  
  
               dout.close();  
               s.close();  
             }catch(Exception e)
             {
	System.out.println(""+e);
             }
    }
}  
