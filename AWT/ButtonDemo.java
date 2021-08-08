/*FlowLayout(): creates a flow layout with centered alignment and a default 5 unit
horizontal and vertical gap.The FlowLayout is used to arrange the components in a 
line, one after another (in a flow). It is the default layout of applet or panel.
Fields of FlowLayout class*/
import java.awt.*;
class ButtonDemo extends Frame
{
    public ButtonDemo()
    {
        setLayout(new FlowLayout());
        Button b2= new Button("Click here");
        add(b2);
    }

    public static void main(String[] args)
    {
        ButtonDemo n= new ButtonDemo();
        n.setTitle("Button Demonstration");
        n.setSize(300,300);
        n.setVisible(true);
    }
}