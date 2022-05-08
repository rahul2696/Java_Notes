import javax.swing.*;
import java.awt.event.*;

class JFCSwing extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2;

    public JFCSwing()
    {
        setLayout(null);
        l1=new JLabel("Amount ");
        l2=new JLabel("Result here...");
        t1=new JTextField();
        b1=new JButton("Calculate");
        b2=new JButton("Exit");

        l1.setBounds(30,20,100,25);
        t1.setBounds(130,20,100,25);
        b1.setBounds(30,50,90,25);
        b2.setBounds(130,50,100,25);
        l2.setBounds(30,90,250,25);

        add(l1);
        add(l2);
        add(b1);
        add(b2);
        add(t1);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setTitle("SohamGlobal Swing App");
        setSize(350,200);
        setLocation(400,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        double amt,disc;

        if(e.getSource()==b2)
        System.exit(0);

        if(e.getSource()==b1)
        {
            try
            {
            amt=Double.parseDouble(t1.getText());
            }
            catch(Exception ex)
            {
                amt=0;
                JOptionPane.showMessageDialog(null,"Invalid amount");
            }
            disc=amt*9/100;
            l2.setText("Discount will be : "+disc);
        }
    }

    public static void main(String args[])
    {
        JFCSwing obj=new JFCSwing();
    }
}