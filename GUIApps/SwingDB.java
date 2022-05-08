import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class SwingDB extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2;

    public SwingDB()
    {
        setLayout(null);
        l1=new JLabel("Number ");
        l2=new JLabel("Result here...");
        t1=new JTextField();
        b1=new JButton("Search");
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

        setTitle("Database Swing App");
        setSize(350,200);
        setLocation(400,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int no;
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        if(e.getSource()==b2)
        System.exit(0);

        if(e.getSource()==b1)
        {
            try
            {
            no=Integer.parseInt(t1.getText());
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visatransdb?user=root&password=volkswagen");
            pst=con.prepareStatement("select * from celebs where celebno=?;");
            pst.setInt(1,no);
            rs=pst.executeQuery();
            if(rs.next())
            {
                l2.setText("Name : "+rs.getString("celebnm")+" | Field : "+rs.getString("field"));
            }
            else
            l2.setText("Celebrity not found");

            }
            catch(Exception ex)
            {
                
                JOptionPane.showMessageDialog(null,"Invalid number");
            }
            
        }
    }

    public static void main(String args[])
    {
        SwingDB obj=new SwingDB();
    }
}