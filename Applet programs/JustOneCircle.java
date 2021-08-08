/*<applet code="JustOneCircle.class" width="300" height="300">  
</applet>  */
import java.applet.*;
import java.awt.*;

// assume that the drawing area is 150 by 150
public class JustOneCircle extends Applet
{
  final int radius = 25;

  public void paint ( Graphics gr )
  { 
    gr.setColor( Color.blue );
    gr.fillRect( 0, 0, 150, 150 );
    gr.setColor( Color.red );
    gr.fillOval( (150/2 - radius), (150/2 - radius), radius*2, radius*2 );
   }
}

