import java.awt.*;
import java.awt.event.*;
class RadioButtonExample extends Frame implements ItemListener
{	
	Label l1,l2;
	Checkbox c1,c2,c3;
	CheckboxGroup cb;
	Panel p1;
	 RadioButtonExample()
	{
		l1=new Label("Select your Fav Lang");
		l2=new Label("");
		p1=new Panel();
		cb=new CheckboxGroup();
		c1=new Checkbox("Java",cb,true);
		c2=new Checkbox("HTML",cb,false);
		c3=new Checkbox("Python",cb,false);


		setSize(300,300);
		setTitle("Checkbox example");
		setVisible(true);
		setLayout(new GridLayout(2,2));

		p1.add(c1);
		p1.add(c2);
		p1.add(c3);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		add(l1);
		//add(c1);
		//add(c2);
		//add(c3);
		add(p1);
		add(l2);

	}
	public void itemStateChanged(ItemEvent ie)
	{	
		String msg1="",msg2="",msg3="";
		if(c1.getState())
		{
			msg1="You select Java";
		}
		else if(c2.getState())
		{
			msg1="You select HTML";
		}
		else
		{
			msg1="You select Python";
		}
		l2.setText(""+msg1);
	}
	public static void main(String ar[])
	{
		new  RadioButtonExample();
	}
	
}