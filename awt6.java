import java.awt.*;
import java.awt.event.*;
class awt6 extends Frame implements ActionListener
{
private Button b1,b2;
private Label l;
awt6()
{
super("My first event programming example");
b1=new Button("One");
b2=new Button("Two");
b1.addActionListener(this);
b2.addActionListener(this);
l=new Label(" 		             ");
FlowLayout fl=new FlowLayout();
setLayout(fl);
add(b1);
add(b2);
add(l);
setLocation(300,200);
setSize(500,100);
setVisible(true);
}
public void actionPerformed(ActionEvent ev)
{
if(ev.getSource()==b1)
{
l.setText("One clicked");
System.out.println("Button with text as One got clicked");
}
if(ev.getSource()==b2)
{
l.setText("Two clicked");
System.out.println("Button with text as Two got clicked");
}
}
}
class awt6psp 
{
public static void main(String gg[])
{
awt6 a=new awt6();
}
}