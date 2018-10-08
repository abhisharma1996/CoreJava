import java.util.Calendar;
import java.util.GregorianCalendar;
public class DateDemo1 {
	private int date, year;
	private int month;
	public DateDemo1() {
		super();
	}
	public DateDemo1(int date, int month, int year) {
		super();
		this.date = date;
		this.year = year;
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
}
