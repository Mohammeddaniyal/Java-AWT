import java.awt.*;
class awt2 extends Frame
{
private Button b1,b2,b3,b4,b5,b6;
awt2()
{
super("My Second AWT Example");
b1=new Button("One");
b2=new Button("Two");
b3=new Button("Three");
b4=new Button("Four");
b5=new Button("Five");

GridLayout gl=new GridLayout(2,3);
setLayout(gl);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(new Label("         "));
setLocation(300,200);
setSize(500,300);
setVisible(true);
}
}
class awt2psp
{
public static void main(String gg[])
{
awt2 a=new awt2();
}
}