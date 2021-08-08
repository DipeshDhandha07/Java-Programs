import java.io.*; 
import java.io.PrintStream; 
import java.net.ServerSocket; 
import java.net.Socket; 
public class Server1 
{
 public static void main(String[] args)
 {
    try 
    {
    ServerSocket ss = new ServerSocket(1564);
    System.out.println("waiting for request....");
    
    //while(true){
    Socket s = ss.accept();
    System.out.println("Request accepted"); 
    
    // takes input from the client socket
    BufferedReader ifc=new BufferedReader(new InputStreamReader(s.getInputStream()));
    //DataInputStream oc=new DataInputStream(s.getInputStream());
    
    String cs=ifc.readLine();
    System.out.println(""+cs);
    String s1="";
    int a=Integer.parseInt(cs);
    if(a>0){
    System.out.println("positive");
    s1="positive";}
    else
    {
    System.out.println("negative");s1="negative";
    }
    
    DataOutputStream ds=new DataOutputStream(s.getOutputStream());
    ds.writeBytes(s1+"\n");
    s.close();
    }
    catch (Exception e) { System.out.println("Not Found data for Socket : "+e); }
    }
    }
    