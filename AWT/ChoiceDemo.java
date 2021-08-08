import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo extends Frame implements ItemListener
{
    Label l1,l2,l3;
    Choice c1,c2;
    ChoiceDemo()
    {
        l1= new Label("Select Food");
        l3= new Label("");
        l2= new Label("");
        c1= new Choice();
        c2= new Choice();
        c1.add("Breakfast");
        c1.add("Lunch");
        c1.add("Dinner");
        c2.add("Pizza");
        c2.add("Burger");
        c2.add("Sandwich");
        add(l1);
        add(c1);
        add(c2);
        add(l2);
        add(l3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        l2.setBounds(30,50,100,40);   
        l3.setBounds(30,50,100,40); 
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String str= c1.getSelectedItem();
        l3.setText(""+str);
        String str1= c2.getSelectedItem();
        l2.setText(""+str1);      
    }
    public static void main(String[] args)
    {
        ChoiceDemo ch=new ChoiceDemo();
        ch.setSize(600,300);
        ch.setTitle("Choice Demonstration");
        ch.setVisible(true);
        ch.setLayout(new FlowLayout());
    }
}