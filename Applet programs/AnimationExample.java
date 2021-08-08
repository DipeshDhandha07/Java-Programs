/*<applet code="AnimationExample.class" width="300" height="300">  
</applet>  */
import java.applet.*;
import java.awt.*;
public class AnimationExample extends Applet 
{  
  Image picture,picture1;    
  public void init() 
  {  
    picture= getImage(getDocumentBase(),"C:\\Users\\DIPESH\\Pictures\\Mickey.gif");  
    picture1=getImage(getDocumentBase(),"C:\\Users\\DIPESH\\Pictures\\walk.gif");  	
  }  

  public void paint(Graphics g) 
  {  
    for(int i=0;i<500;i++)
    {  
      g.drawImage(picture, i,30, this);  
      try{
           Thread.sleep(100);
         }
      catch(Exception e)
      {
        System.out.println(e);
      }  
    } 

	for(int i=0;i<500;i++)
  {  
      g.drawImage(picture1, i,100, this);  
      try
        {
          Thread.sleep(100);
        }catch(Exception e)
        {
        }  
    }    
  }
}    
