import java.util.*;
public class DateDemo {
	public static void main(String[] args) {
		DateDemo1 da=new DateDemo1(1, 8,2016);
		int day, month, year;
		GregorianCalendar date = new GregorianCalendar();
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH)+1;
		year = date.get(Calendar.YEAR);
		int a=day-da.getDate();
		int b=month-da.getMonth();
		int c=year-da.getYear();
		System.out.println("Days is   "+a+"   Months is   "+b+"   Years is   "+c);
		
			
}
	}
