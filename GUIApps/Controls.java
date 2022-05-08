import java.awt.*;

class Controls extends Frame
{
    Label l1;
    TextField t1;
    Button b1;
    Choice cho;
    Checkbox cb1,cb2;
    Checkbox rb1,rb2;
    List lst;

    public Controls()
    {
        l1=new Label("Name ");
        t1=new TextField();
        b1=new Button("Close");
        cho=new Choice();
        cho.add("Microsoft");
        cho.add("Oracle");
        cho.add("Volkswagen");
        cho.add("Accenture");
        cb1=new Checkbox("Music");
        cb2=new Checkbox("Sports");
        CheckboxGroup cbg=new CheckboxGroup();
        rb1=new Checkbox("Male",cbg,false);
        rb2=new Checkbox("Female",cbg,true);
        lst=new List();
        lst.add("Java");
        lst.add("Soham");
        lst.add("Sharayu");
        lst.add("Python");
        lst.add("SQL");

        this.setLayout(null);
        l1.setBounds(50,75,80,20);
        t1.setBounds(140,75,100,20);
        b1.setBounds(50,110,80,20);
        cho.setBounds(50,150,100,20);
        cb1.setBounds(50,190,100,20);
        cb2.setBounds(150,190,100,20);
        rb1.setBounds(50,230,100,20);
        rb2.setBounds(150,230,100,20);
        lst.setBounds(300,75,100,200);

        add(l1);
        add(t1);
        add(b1);
        add(cho);
        add(cb1);
        add(cb2);
        add(rb1);
        add(rb2);
        add(lst);
    }
    public static void main(String[] args)
    {
        Controls obj=new Controls();
        obj.setTitle("Controls in Java AWT");
        obj.setLocation(400,300);
        obj.setSize(500,300);
        obj.setVisible(true);
    }
}