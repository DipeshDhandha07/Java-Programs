import java.net.*;
class InetAddressDemo
{
    public static void main(String[] args)throws UnknownHostException
    {

        //gets IP address of given domain/hostname
        InetAddress address1 = InetAddress.getByName("www.java.net");  
        System.out.println(address1.getHostAddress());      
   
       //gets hostname from IP address: 
        InetAddress address2 = InetAddress.getByName("8.8.8.8");
        System.out.println(address2.getHostName());

        //get the localhost address:
        InetAddress addr1= InetAddress.getLocalHost();	
        System.out.println(addr1);

       //gets IP address of hostname
        InetAddress addr2= InetAddress.getByName("www.github.com");
        System.out.println(addr2);

        //List all IP addresses associate with a hostname/domain: 
        InetAddress addr3[]= InetAddress.getAllByName("www.google.com"); for(int i=0; i<addr3.length;i++)
        System.out.println(addr3[i]);
    }
}
