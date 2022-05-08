import java.awt.*;

class SimpleGUI extends Frame
{
    Label l1;

    public SimpleGUI()
    {
        l1=new Label("Welcome to Java GUI Applications");
        this.setLayout(null);
        l1.setBounds(50,75,250,20);
        add(l1);
    }

    public static void main(String args[])
    {
        SimpleGUI obj=new SimpleGUI();
        obj.setTitle("SohamGlobal");
        obj.setSize(500,300);
        obj.setLocation(450,200);
        obj.setVisible(true);
    }
}