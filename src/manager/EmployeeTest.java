package manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 测试Employee类
 * @author 董书广
 *
 */
public class EmployeeTest {
	public static void main(String[] args) throws ParseException {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("dong", 70000, 1993, 7, 22);
		staff[1] = new Employee("zhang", 60000, 1993, 4, 4);
		staff[2] = new Employee("li", 70000, 1991, 7, 12);
//		for(Employee el: staff){
//			el.raiseSalary(5);
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			System.out.println("name:" + el.getName() + "--salary:" + el.getSalary() + "--hireDay:" + sdf.format(el.getHireDay()));
//		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(staff[0].getHireDay()));
		Date date = staff[0].getHireDay();
		double mill = 365.25*24*60*60*1000;
		date.setTime(date.getTime() - (long)mill);
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(staff[0].getHireDay()));
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.YEAR, 12);
		date = cl.getTime();
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(staff[0].getHireDay()));
	}
}
