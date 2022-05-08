package shopping;

public class Member
{
private int memno;
private String memnm;

public Member(int memno,String memnm)
{
this.memno=memno;
this.memnm=memnm;
}

public void showMember()
{
System.out.print(memno+"   ");
System.out.println(memnm);
}

}

