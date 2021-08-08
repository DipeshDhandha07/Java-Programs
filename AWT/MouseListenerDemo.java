import java.awt.*;
import java.awt.event.*;
class MouseListenerDemo extends Frame implements MouseListener
{
    Frame f;
    Label l;
    MouseListenerDemo()
    {
        f=new Frame();
        l=new Label();
        f.setTitle("MouseListener Demonstration");
        f.setSize(400,300);
        f.setVisible(true);
        l.setBounds(40,50,100,20);
        f.add(l);
        f.setLayout(null); 
        f.addMouseListener(this); //registering MouseListener for whole Frame
    }
    public void mousePressed(MouseEvent me)
    {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent me)
    {
        l.setText("Mouse Released");
    }
    public void mouseExited(MouseEvent me)
    {
        l.setText("Mouse Exited");
    }
    public void mouseEntered(MouseEvent me)
    {
        l.setText("Mouse Entered");
    }
    public void mouseClicked(MouseEvent me)
    {
        l.setText("Mouse Clicked");
    }
    public static void main(String[] args)
    {
        new MouseListenerDemo();     
    }
}