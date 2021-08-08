/*<applet code="DisplayImage.class" width="300" height="300">  
</applet>  */
import java.applet.*;
import java.awt.*;
  
public class DisplayImage extends Applet 
{  
  Image picture;  
  public void init() 
  {  
    picture = getImage(getDocumentBase(),"donald.jpg");  
  }  
    
  public void paint(Graphics g) 
  {  
    g.drawImage(picture, 30,30, this);  
  }  
      
  }  
