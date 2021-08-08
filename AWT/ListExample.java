import java.awt.*;
import java.awt.event.*;
class ListExample extends Frame implements ItemListener
{
	List l1;
	Label l2;
	String s1="";
	ListExample()
	{
		l1=new List();
		l1.add("Python");
		l1.add("Java");
		l1.add("DBMS");
		l2=new Label("");

		l1.addItemListener(this);
		l1.setMultipleMode(true);
		
		setSize(300,200);
		setTitle("LIST");
		setVisible(true);
		setLayout(new FlowLayout());	
		
		add(l1);
		add(l2);
	}
	public void itemStateChanged(ItemEvent ie)
	{	
		s1="";
		String str[]=l1.getSelectedItems();	
		for (String s:str)
		{
			s1+=s+" ";
			l2.setText(""+s1);	
		}		
	}
	public static void main(String ar[])
	{
		new ListExample();
	}
}