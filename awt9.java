import java.awt.*;
import java.awt.event.*;
class awt9 extends Frame implements MouseListener
{
private Button b1;
private TextArea ta;
awt9()
{
ta=new TextArea();
b1=new Button("Press");
setLayout(new FlowLayout());
add(b1);
add(ta);
b1.addMouseListener(this);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent ev)
{
System.exit(0);
}
});
setLocation(300,200);
setSize(500,600);
setVisible(true);
}


public  void mouseClicked(MouseEvent me)
{
ta.append("Click count : "+me.getClickCount()+"\n");
ta.append("X on screen : "+me.getXOnScreen()+"\n");
ta.append("Y on screen : "+me.getYOnScreen()+"\n");
ta.append("X : "+me.getX()+"\n");
ta.append("Y : "+me.getY()+"\n");
if(me.getButton()==me.BUTTON1)
{
System.out.println("Button 1 got clicked");
}
if(me.getButton()==me.BUTTON2)
{
System.out.println("Button 2 got clicked");
}
if(me.getButton()==me.BUTTON3)
{
System.out.println("Button 3 got clicked");
}
System.out.println("mouseClicked got called");
}
public  void mousePressed(MouseEvent me)
{
System.out.println("mousePressed got called");
}
public void mouseReleased(MouseEvent me)
{
System.out.println("mouseReleased got called");
}
public void mouseEntered(MouseEvent me)
{
System.out.println("mouseEntered got called");
}
public void mouseExited(MouseEvent me)
{
System.out.println("mouseExited got called");
}
}
class awt9psp
{
public static void main(String gg[])
{
awt9 a=new awt9();
}
}