import java.awt.*;
class MenuDemo extends Frame
{
    MenuDemo()
    {
        MenuBar mb= new MenuBar();
        Menu m1= new Menu("File");
        Menu m2= new Menu("Edit");
        Menu m3= new Menu("Format");
        Menu m4= new Menu("Open");
        MenuItem mi1= new MenuItem("New");
        MenuItem mi2= new MenuItem("Save");
        MenuItem mi3= new MenuItem("Save as");
        MenuItem mi4= new MenuItem("Cut");
        MenuItem mi5= new MenuItem("Copy");
        MenuItem mi6= new MenuItem("Paste");
        MenuItem mi7= new MenuItem("Font");
        MenuItem mi8= new MenuItem("File 1");
        MenuItem mi9= new MenuItem("File 2"); 
        CheckboxMenuItem cm= new CheckboxMenuItem("Word Wrap",true);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(mi1); 
        m1.add(mi2); 
        m1.add(mi3);
        m1.add(m4);     // nesting of menu
        m2.add(mi4);
        m2.add(mi5);
        m2.add(mi6);
        m3.add(cm);
        m2.add(mi7);
        m4.add(mi8);
        m4.add(mi9);
        setMenuBar(mb); 
    }
 
    public static void main(String[] args)
    {
        MenuDemo m=new MenuDemo();
        m.setTitle("Menu Demonstration");
        m.setSize(300,300);
        m.setVisible(true);
    }
}