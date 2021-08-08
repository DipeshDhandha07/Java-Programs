import java.awt.*;  
import java.awt.event.*;  
//public class KeyListenerExample extends Frame implements KeyListener{  
public class KeyListenerExample extends KeyAdapter
{  
    Label l;  
    Frame f;
    TextField area;  
    KeyListenerExample()
    {  
        f=new Frame();
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextField(50);  
        area.setBounds(20,80,90, 30);  
        area.addKeyListener(this);  
        f.add(l);
        f.add(area);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public void keyPressed(KeyEvent e)
    {  
        l.setText("Key Pressed");  
    }  
    
    public void keyTyped(KeyEvent e) 
    {  
       l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) 
    {  
        new KeyListenerExample();  
    }  
}  