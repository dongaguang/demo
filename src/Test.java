import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Test {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String f="2012-5-27";
		String o="2012-6-27";
		
		Date fdate =sdf.parse(f);
		Date odate =sdf.parse(o);
		Long c = sdf.parse(o).getTime()-sdf.parse(f).getTime();
		long d = c/1000/60/60/24;//天
		System.out.println(d+"天");
	}
	
	public static int daysOfTwo(Date fDate, Date oDate) {
	       Calendar aCalendar = Calendar.getInstance();
	       aCalendar.setTime(fDate);
	       int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
	       aCalendar.setTime(oDate);
	       int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
	       return day2 - day1;

	    }
}
