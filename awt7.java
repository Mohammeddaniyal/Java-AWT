import java.awt.*;
import java.awt.event.*;
class awt7 extends Frame implements ItemListener
{
private Checkbox cb1,cb2;
private TextArea ta;
private void updateStates()
{
if(cb1.getState()) ta.append("Reading : checked\n");
else ta.append("Reading : unchecked\n");
if(cb2.getState()) ta.append("Sudoku : checked\n");
else ta.append("Suduko : unchecked\n");
}
class CloseHandler extends WindowAdapter implements ActionListener
{
private Button b1,b2;
private Label l1;
public void windowClosing(WindowEvent ev)
{
System.out.println("Window closing got called");
b1=new Button("Don't Close");
b2=new Button("Close");
l1=new Label("                                                ");
b1.addActionListener(this);
b2.addActionListener(this);
setLayout(new FlowLayout());
add(b1);
add(b2);
setLocation(300,200);
setSize(500,600);
setVisible(true);
}
public void actionPerformed(ActionEvent ev)
{
if(ev.getSource()==b1)
{
l1.setText("Don't Close Clicked");
System.out.println("Button with text as Don't Close got called");
}
if(ev.getSource()==b2)
{
l1.setText("Close Clicked");
System.out.println("Button with text as Close got called");
System.exit(0);
}
setVisible(false);
}
}
awt7()
{
super("My Second event programming example");
cb1=new Checkbox("Reading");
cb2=new Checkbox("Sudoku");
ta=new TextArea();
cb1.addItemListener(this);
cb2.addItemListener(this);
CloseHandler cbh=new CloseHandler();
addWindowListener(cbh);
updateStates();
setLayout(new FlowLayout());
add(cb1);
add(cb2);
add(ta);
setLocation(300,200);
setSize(500,600);
setVisible(true);
}
public void itemStateChanged(ItemEvent ev)
{
if(ev.getItemSelectable()==cb1)
{
System.out.println("State of Reading changed to : "+cb1.getState());
}
if(ev.getItemSelectable()==cb2)
{
System.out.println("State of Sudoku changed to : "+cb2.getState());
}
updateStates();
}
}
class awt7psp
{
public static void main(String gg[])
{
awt7 a=new awt7();
}
}