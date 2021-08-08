import java.io.*;
import java.io.InputStreamReader; 
import java.net.Socket; 
import java.net.UnknownHostException; 
{
 public static void main(String[] args)
 {
  System.out.println("sSending a request.....");
  try 
 {
    Socket s = new Socket("127.0.0.1",1564); 
    System.out.println("connected successfully.....");
    // takes input from terminal
     
      BufferedReader ifu=new BufferedReader(new InputStreamReader(System.in));	
      System.out.println("enter Number to check positive or negative");
      String line=ifu.readLine(); 
       // sends output to the socket
      DataOutputStream  out = new DataOutputStream(s.getOutputStream());
      out.writeBytes(line+"\n");
      System.out.print("server rply");
      BufferedReader is=new BufferedReader(new InputStreamReader(s.getInputStream()));
      String line1=is.readLine(); 
      System.out.println("Reply frm server "+line1.trim());
  } catch (UnknownHostException e)
 {
    System.out.println("Not find the IP-ADDRESS for :"+e);
 } 
      catch (IOException e) 
      { 
       System.out.println("Not Found data for Socket : "+e); 
      }
 }
}
