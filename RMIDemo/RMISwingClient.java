import javax.swing.*;
import java.awt.event.*;
import java.rmi.*;
import java.net.MalformedURLException;

class RMISwingClient extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1;
JButton b1,b2;

public RMISwingClient()
{
setLayout(null);
l1=new JLabel("Number");
l2=new JLabel("RMI result here...");
t1=new JTextField();
b1=new JButton("Retrieve");
b2=new JButton("Exit");
b1.addActionListener(this);
b2.addActionListener(this);


l1.setBounds(30,20,100,25);
t1.setBounds(130,20,100,25);
l2.setBounds(30,50,250,25);
b1.setBounds(30,80,90,25);
b2.setBounds(130,80,90,25);

add(l1);
add(t1);
add(l2);

add(b1);
add(b2);

setTitle("Soham Consultants");
setSize(350,170);
setLocation(300,200);
setVisible(true);
}


public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{

try
{
MyRMIInterface obj =(MyRMIInterface)Naming.lookup("soham");

int n=Integer.parseInt(t1.getText());
//call remote methods from the server
double rs=obj.getBalance(n);
l2.setText("Balance from RMI "+rs);

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, "Error calling RMI services...");
}


}
else
System.exit(0);
}


public static void main(String args[])
{
RMISwingClient obj=new RMISwingClient();
}
}



























