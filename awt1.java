import java.awt.*;
class awt1 extends Frame
{
private Label l1,l2,l3,l4,l5;
private TextField t1,t2;
private Choice c1;
private Checkbox cb1;
private List lst1;
private CheckboxGroup cg1;
private Checkbox r1,r2;
private Button b1,b2;
awt1()
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
lst1.add("Swimming");
lst1.add("Origami");
lst1.add("Anime");
lst1.add("Games");
lst1.add("Wrestling");
lst1.add("Reading");
lst1.add("Painting");
l5=new Label("Indian");
cb1=new Checkbox();

cg1=new CheckboxGroup();
r1=new Checkbox("Male",cg1,true);
r2=new Checkbox("Female",cg1,false);

b1=new Button("Save");
b2=new Button("Cancel");

FlowLayout f=new FlowLayout();
setLayout(f);
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
add(r1);
add(r2);
add(b1);
add(b2);
setLocation(300,50);
setSize(500,700);
setVisible(true);
}
}
class awt1psp
{
public static void main(String gg[])
{
awt1 a=new awt1();
}
}