import java.awt.*;
import java.awt.event.*;
class MyDrawingPad extends Canvas
{
private int lastX,lastY;
MyDrawingPad()
{
setBackground(new Color(100,200,100));
setForeground(Color.blue);
}
public boolean mouseDown(Event e,int x,int y)
{
lastX=x;
lastY=y;
return true;
}
public boolean mouseDrag(Event e,int x,int y)
{
Graphics graphics=getGraphics();
graphics.drawLine(lastX,lastY,x,y);
lastX=x;
lastY=y;
return true;
}
}
class awt11 extends Frame
{
private MyDrawingPad mdp;
awt11()
{
mdp=new MyDrawingPad();
setLayout(new BorderLayout());
add(mdp,BorderLayout.CENTER);
setLocation(100,100);
setSize(600,600);
setVisible(true);
}
}
class awt11psp
{
public static void main(String gg[])
{
awt11 a=new awt11();
}
}