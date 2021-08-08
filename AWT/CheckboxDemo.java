import java.awt.*;
public class CheckboxDemo extends Frame
{
    public CheckboxDemo()
    {
        setLayout(new FlowLayout());
        Checkbox c1= new Checkbox("Pizza");
        Checkbox c2= new Checkbox("French Fries");
        Checkbox c3= new Checkbox("Sandwich");
        Checkbox c4= new Checkbox("Burger",true);
        add(c1);
        add(c2);
        add(c3);   
        add(c4);
    }

    public static void main(String[] args)
    {
        CheckboxDemo c= new CheckboxDemo();
        c.setTitle("Checkbox Demonstration");
        c.setSize(400,400);
        c.setVisible(true);
         
    }
}