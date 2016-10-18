package dong;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import exp.BaseException;

/**
 * 日期类
 * @author 董书广
 *
 */
public class DateOperate {
	public static void main(String[] args) {
		DateOperate dor = new DateOperate();
//		dor.createDateObject();
//		dor.someOperate();
		dor.nowCalendar();
	}
	
	/**
	 * 创建日期
	 */
	private void createDateObject(){
//		Date date = new Date();
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
		System.out.println(sdf.format(cl.getTime()));
	}
	
	/**
	 * some operate
	 * @throws Exception 
	 */
	public void someOperate() throws Exception{
		Calendar cl = Calendar.getInstance();
		int month = cl.get(5);
		for(int i = 0; i< 17;i++){
			System.out.println(cl.get(i));
		}
		throw new BaseException("哈哈哈");
	}
	
	/**
	 * 展示本月的日历
	 */
	private void nowCalendar(){
		//初始化对象
		Calendar c = Calendar.getInstance();
		int today = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		//把今天设为本月第一天，并获得星期几
		c.set(Calendar.DAY_OF_MONTH, 1);
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		int firstDayOfWeek = c.getFirstDayOfWeek();
		int indent = 0;
		while(weekDay != firstDayOfWeek){
			indent++;
			c.add(Calendar.DAY_OF_MONTH, -1);
			weekDay = c.get(Calendar.DAY_OF_WEEK);
		}
		String[] weekDayNames = new DateFormatSymbols().getShortWeekdays();
		do{
			System.out.printf("%4s",weekDayNames[weekDay]);
			c.add(Calendar.DAY_OF_MONTH, 1);
			weekDay = c.get(Calendar.DAY_OF_WEEK);
		}while(weekDay != firstDayOfWeek);
		System.out.println();
		for(int i = 1; i <= indent; i++){
			System.out.printf("%4s","");
		}
		c.set(Calendar.DAY_OF_MONTH, 1);
		do {
			int day = c.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d",day);
			if(day == today){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
			weekDay = c.get(Calendar.DAY_OF_WEEK);
			if(weekDay == firstDayOfWeek){
				System.out.println();
			}
		} while (c.get(Calendar.MONTH) == month);
		if(weekDay != firstDayOfWeek){
			System.out.println();
		}
	}
}
