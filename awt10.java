import java.awt.*;
import java.awt.event.*;
class awt10 extends Frame implements MouseMotionListener
{
private Button b1;
private TextArea ta;
awt10()
{
ta=new TextArea();
b1=new Button("Press");
setLayout(new FlowLayout());
add(b1);
add(ta);
b1.addMouseMotionListener(this);
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


public void mouseDragged(MouseEvent me)
{
System.out.println("mouseDragged got called");
}
public void mouseMoved(MouseEvent me)
{
System.out.println("mouseMoved got called");
}
}
class awt10psp
{
public static void main(String gg[])
{
awt10 a=new awt10();
}
}