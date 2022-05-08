import java.io.*;

public class Contact implements Serializable
{
private String contnm;
private String mobile;
private String emailid;
private String dob;

public void setContnm(String contnm)
{
this.contnm=contnm;
}

public void setMobile(String mobile)
{
this.mobile=mobile;
}

public void setEmailid(String emailid)
{
this.emailid=emailid;
}

public void setDob(String dob)
{
this.dob=dob;
}

public void showContactInfo()
{
System.out.println("Name    : "+contnm);
System.out.println("Mobile  : "+mobile);
System.out.println("EmailID : "+emailid);
System.out.println("DoB     : "+dob);
}
}
