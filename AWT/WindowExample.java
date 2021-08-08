import java.awt.*;  
import java.awt.event.*;
public class WindowExample extends Frame implements WindowListener
{  
    WindowExample()
    {  
        addWindowListener(this); //         
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
      
    public static void main(String[] args) 
    {  
        new WindowExample();  
    }     
    public void windowActivated(WindowEvent we) 
    {  
        System.out.println("activated");  
    }  
    public void windowClosed(WindowEvent we) 
    {  
    System.out.println("closed");  
    }  
    public void windowClosing(WindowEvent we) 
    {  
    System.out.println("closing");  
    dispose();  
    }  
    public void windowDeactivated(WindowEvent we) 
    {  
      System.out.println("deactivated");  
    }  
    public void windowDeiconified(WindowEvent we) 
    {  
      System.out.println("deiconified");  
    }  
    public void windowIconified(WindowEvent we) 
    {  
     System.out.println("iconified");  
    }  
    public void windowOpened(WindowEvent we) 
    {  
    System.out.println("opened");  
    }  
}  