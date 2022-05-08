import java.util.*;

class TryCalendar
{
public static void main(String args[])
{
Calendar cal=Calendar.getInstance();
System.out.println(cal.getTime());

System.out.println("Date : "+cal.get(Calendar.DATE));
System.out.println("Month : "+cal.get(Calendar.MONTH)+1);
System.out.println("Year : "+cal.get(Calendar.YEAR));
System.out.println("Hour : "+cal.get(Calendar.HOUR));
System.out.println("Minute : "+cal.get(Calendar.MINUTE));
System.out.println("Second : "+cal.get(Calendar.SECOND));

cal.add(Calendar.DATE,300);
System.out.println("Date after 300 days "+cal.getTime());

cal.add(Calendar.MONTH,15);
System.out.println("Date after 15 months "+cal.getTime());

cal.add(Calendar.YEAR,-7);
System.out.println("Date before 7 years "+cal.getTime());

}
}
