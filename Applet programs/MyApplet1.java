/*<applet code="MyApplet1.class" width="300" height="300">  
</applet>*/
import java.applet.*;
import java.awt.*;
public class MyApplet1 extends Applet 
{
	
	public void init()
	{
		Label l1=new Label("Heelooo");
		TextField t1=new TextField(20);
		add(l1);add(t1);
		setLayout(new FlowLayout());
	}
	
	public void paint(Graphics g)
	{
		System.out.println("Painting...");
	}
	
	public void destroy()
	{
		System.out.println("Applet destroyed");
	}
}
