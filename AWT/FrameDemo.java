import java.awt.*;
import java.awt.event.*;
public class FrameDemo extends Frame
{
      public FrameDemo()
      {
            Button btn=new Button("Hello World");
            add(btn); //adding a new Button.
            setSize(400, 300); //setting size.
            setTitle("StudyTonight"); //setting title.
            setLayout(new FlowLayout()); //set default layout for frame.
            setVisible(true); //set frame visibilty true.
      }

      public static void main (String[] args)
      {
            FrameDemo ta = new FrameDemo(); //creating a frame.
      }
}