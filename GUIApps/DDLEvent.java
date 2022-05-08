import java.awt.*;
import java.awt.event.*;

class DDLEvent extends Frame implements ItemListener
{
    Label l1;
    Choice cho;
    

    public DDLEvent()
    {
        l1=new Label();
        cho=new Choice();
        cho.add("Microsoft");
        cho.add("Oracle");
        cho.add("Volkswagen");
        cho.add("Accenture");

        this.setLayout(null);
        l1.setBounds(50,75,80,20);
        cho.setBounds(50,150,100,20);
        
        cho.addItemListener(this);

        add(l1);
        add(cho);
    }
    public void itemStateChanged(ItemEvent e)
    {
        l1.setText(cho.getSelectedItem());
    }
    public static void main(String[] args)
    {
        DDLEvent obj=new DDLEvent();
        obj.setTitle("Controls in Java AWT");
        obj.setLocation(400,300);
        obj.setSize(500,300);
        obj.setVisible(true);
    }
}