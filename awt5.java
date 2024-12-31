import java.awt.*;
class HeadingPanel extends Panel
{
private Label heading;
HeadingPanel()
{
heading=new Label("Student (Add Module)");
heading=new Label("Student (Add Module)");
Panel p1=new Panel();
setLayout(new GridLayout(2,3));
add(new Label("             "));
add(heading);
add(new Label("             "));
add(new Label("             "));
add(new Label("             "));
add(new Label("             "));
}
}
class GenderPanel extends Panel
{
private CheckboxGroup cg;
private Checkbox r1,r2;
GenderPanel()
{
cg=new CheckboxGroup();
r1=new Checkbox("Male",cg,true);
r2=new Checkbox("Female",cg,false);
setLayout(new GridLayout(1,2));
add(r1);
add(r2);
}
}

class ButtonPanel extends Panel
{
private Button b1,b2;
ButtonPanel()
{
b1=new Button("Save It");
b2=new Button("Cancel");
setLayout(new GridLayout(2,5));
add(new Label("           "));
add(b1);
add(new Label("           "));
add(b2);
add(new Label("           "));
add(new Label("           "));
add(new Label("           "));
add(new Label("           "));
add(new Label("           "));
add(new Label("           "));
}
}

class InputPanel extends Panel
{
private Label heading,l1,l2,l3,l4,l5,l6;
private TextField t1,t2;
private Choice c1;
private List lst1;
private Checkbox cb1;
private GenderPanel gp;
InputPanel()
{
l1=new Label("Roll Number");
t1=new TextField(10);
l2=new Label("Name");
t2=new TextField(50);
l3=new Label("City");
c1=new Choice();
c1.add("Ujjain");
c1.add("Indore");
c1.add("Dewas");
c1.add("Mumbai");
l4=new Label("Hobbies");
lst1=new List(4,true);
lst1.add("Running");
lst1.add("Gaming");
lst1.add("Reading");
lst1.add("Anime");
lst1.add("Origami");
lst1.add("Sleeping");
lst1.add("Swimming");
lst1.add("Hunting");
lst1.add("Hiking");
l5=new Label("Indian");
cb1=new Checkbox();
l6=new Label("Gender");
gp=new GenderPanel();
setLayout(new GridLayout(6,2));
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(c1);
add(l4);
add(lst1);
add(l5);
add(cb1);
add(l6);
add(gp);
}
}
class awt5 extends Frame
{
private InputPanel ip;
private HeadingPanel hp;
private ButtonPanel bp;
awt5()
{
super("My AWT fourth example");
hp=new HeadingPanel();
bp=new ButtonPanel();
ip=new InputPanel();
BorderLayout bl=new BorderLayout();
setLayout(bl);
add(hp,BorderLayout.NORTH);
add(ip,BorderLayout.CENTER);
add(bp,BorderLayout.SOUTH);
setLocation(300,50);
setSize(500,300);
setVisible(true);
}
}
class awt5psp
{
public static void main(String gg[])
{
awt5 a=new awt5();
}
}