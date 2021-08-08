import java.io.*;
import java.io.InputStreamReader; 
import java.net.Socket; 
import java.net.UnknownHostException; 
public class client 
{
	 public static void main(String[] args)
	 {
	 System.out.println("sSending a request.....");
	 try 
		{
			Socket s = new Socket("127.0.0.1",9999); 
			System.out.println("connected successfully.....");
 			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//DataInputStream dr=new DataInputStream(s.getInputStream());
 			System.out.println("response from server...");
			 System.out.println("Client side : ");
			String str=br.readLine();
			System.out.println("msg from server "+str);
 			s.close();
		} catch (UnknownHostException e) { System.out.println("Not find the IP-ADDRESS for :"+e);
		 } catch (IOException e) { System.out.println("Not Found data for Socket : "+e); }
	 }
 }
