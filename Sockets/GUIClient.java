import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GUIClient extends Frame implements ActionListener
{
Label l1;
TextField t1;
TextArea ta;
Button b1,b2;
MySocket ms;

public GUIClient()
{
setLayout(null);
l1=new Label("Enter Name ");
t1=new TextField(15);
ta=new TextArea(3,60);
b1=new Button("Send");
b2=new Button("Exit");

l1.setBounds(30,70,70,20);
t1.setBounds(110,70,100,20);
b1.setBounds(30,90,100,20);
b2.setBounds(150,90,100,20);
ta.setBounds(30,120,250,100);
b1.addActionListener(this);
b2.addActionListener(this);
add(l1);
add(t1);
add(b1);
add(b2);
add(ta);
}
public void actionPerformed(ActionEvent ee)
{
if(ee.getSource()==b1)
{
String nm=t1.getText();
try
{
ta.setText("");
ms=new MySocket("",1234);
//ms=new MySocket(getCodeBase().getHost(),1234);
ms.write(nm);
ta.setText("Result from server...\n"+ms.read());
ms.close();
t1.setText("");
t1.requestFocus();
}
catch(Exception e)
{
ta.setText(String.valueOf(e));
}
}
else
{
System.exit(1);
}

}

public static void main(String args[])
{
GUIClient ac=new GUIClient();
ac.setSize(400,300);
ac.setTitle("soHam");
ac.setVisible(true);
}
}



