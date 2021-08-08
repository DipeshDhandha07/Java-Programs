import java.awt.*;
import java.awt.event.*;
class ActionListenerExample extends Frame implements ActionListener
{
     Label l1,l2,l3;
     TextField t1,t2;
     Button b1,b2;
     ActionListenerExample()
     {
        l1=new Label("Enter Username");
        l2=new Label("Enter Password");
        l3=new Label("");
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Login");
        b2=new Button("Reset");
        b1.addActionListener(this);
        b2.addActionListener(this);
        t2.setEchoChar('*');
        setSize(500,500);
        setVisible(true);
        setTitle("Login");
        setLayout(new GridLayout(4,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l3);
    }   
    public void actionPerformed(ActionEvent ae)
    {
        String str1=t1.getText();
        String str2=t2.getText();
        if(ae.getSource()==b1)
        {
            if(str1.equals("admin")&&str2.equals("admin"))
            {
                l3.setText("Login Successfull");
            }
            else
            {
                l3.setForeground(Color.red);
                l3.setText("Try again Letter");
            }
        }
        else
        {
            t1.setText("");
            t2.setText("");
            l3.setText("");
        }
    }
    public static void main(String ar[])
    {
       new ActionListenerExample();
    }
}