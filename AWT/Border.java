import java.awt.*;  
public class Border extends Frame
{  
    Border()
    {  
        Button b1=new Button("NORTH");;  
        Button b2=new Button("SOUTH");;  
        Label b3=new Label("EAST_Label");;  
        Button b4=new Button("WEST");;  
        Button b5=new Button("CENTER");;  
      
        setLayout(new BorderLayout());
        add(b1,BorderLayout.NORTH);  
        add(b2,BorderLayout.SOUTH);  
        add(b3,BorderLayout.EAST);  
        add(b4,BorderLayout.WEST);  
        add(b5,BorderLayout.CENTER);  
      
        setSize(300,300);  
        setVisible(true);  
}  
    public static void main(String[] args) 
    {  
    new Border();  
    }  
}  