import java.awt.*;
import java.awt.event.*;

class CloseEvent extends Frame implements ActionListener
{
    Button b1;

    public CloseEvent()
    {
        b1=new Button("Close");
        this.setLayout(null);
        b1.setBounds(75,75,100,30);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent e)
    {
        dispose();
    }

    public static void main(String args[])
    {
        CloseEvent obj=new CloseEvent();
        obj.setTitle("Event in Java");
        obj.setLocation(400,300);
        obj.setSize(500,300);
        obj.setVisible(true);
    }
}