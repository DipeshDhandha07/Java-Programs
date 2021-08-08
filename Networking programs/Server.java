import java.io.*; 
import java.io.PrintStream; 
import java.net.ServerSocket; 
import java.net.Socket; 
public class Server
{
 public static void main(String[] args)
 {
  try 
  {
     ServerSocket ss = new ServerSocket(9999);
	 System.out.println("waiting for request....");
	 Socket s = ss.accept();
	 System.out.println("Request accepted"); 
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 DataOutputStream dr=new DataOutputStream(s.getOutputStream());
	 System.out.println(" Enter Msg : ");
	 String str=br.readLine();
	 dr.writeBytes(str+"\n");
	 //dr.flush();
	 //System.out.println("str");
 	 s.close();
    ss.close();
   }
   catch (Exception e) 
     { 
	 System.out.println("Not Found data for Socket : "+e); 
	 }
 }
}