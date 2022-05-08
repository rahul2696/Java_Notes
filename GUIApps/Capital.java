import java.awt.*;
import java.awt.event.*;

class Capital extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1;
    Button b1,b2;

    public Capital()
    {
        l1=new Label("Country ");
        l2=new Label();
        t1=new TextField();
        b1=new Button("Show");
        b2=new Button("Exit");

        this.setLayout(null);

        l1.setBounds(50,75,80,20);
        t1.setBounds(140,75,100,20);
        b1.setBounds(50,110,80,20);
        b2.setBounds(140,110,80,20);
        l2.setBounds(50,150,200,20);

        b1.addActionListener(this);
        b2.addActionListener(this);


        add(l1);
        add(l2);
        add(t1);
        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String co=t1.getText();
            String cap="";
            switch(co)
            {
                case "england":
                cap="London";
                break;
                case "france":
                cap="Paris";
                break;
                case "germany":
                cap="Berlin";
                break;
                default:
                cap="Not found";

            }
            l2.setText(cap);
        }

        if(e.getSource()==b2)
        dispose();
    }
    public static void main(String[] args)
    {
        Capital obj=new Capital();
        obj.setTitle("Country-Capital");
        obj.setLocation(400,300);
        obj.setSize(500,300);
        obj.setVisible(true);
    }
}

