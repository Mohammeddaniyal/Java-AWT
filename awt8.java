import java.awt.*;
import java.awt.event.*;
class awt8 extends Frame 
{
private Checkbox cb1,cb2;
private TextArea ta;
private void updateStates()
{
ta.setText("");
if(cb1.getState()) ta.append("Reading : checked\n");
else ta.append("Reading : unchecked\n");
if(cb2.getState()) ta.append("Sudoku : checked\n");
else ta.append("Suduko : unchecked\n");
}
awt8()
{
super("Checkbox event programming example");
cb1=new Checkbox("Reading");
cb2=new Checkbox("Sudoku");
ta=new TextArea();
updateStates();
setLayout(new FlowLayout());
add(cb1);
add(cb2);
add(ta);
cb1.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent ev)
{
System.out.println("State of Reading changed to : "+cb1.getState());
updateStates();
}
});
cb2.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent ev)
{
System.out.println("State of Sudoku changed to : "+cb2.getState());
updateStates();
}
});
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent ev)
{
System.out.println(cb1.getState()+","+cb2.getState());
System.exit(0);
}
});
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
class awt8psp
{
public static void main(String gg[])
{
awt8 a=new awt8();
}
}