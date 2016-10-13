package manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 雇员类
 * @author 董书广
 *
 */
public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	/**
	 * 构造函数
	 * @throws ParseException 
	 */
	public Employee(String n, double s, int year, int month, int day) throws ParseException{
		this.name = n;
		this.salary = s;
		Calendar calendar = new GregorianCalendar(year, month, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		this.hireDay = calendar.getTime();
	}
	
	/**
	 * 调整工资的方法
	 */
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDay() {
		/**
		 * 这里这样写会有问题
		 * 假如把Employee的一个实例的hireDay赋值给一个date对象
		 * 然后修改这个date对象会引起Employee的这个实例的私有状态
		 * 所以要返回hireDay.clone()(这个对象的副本)
		 */
//		return hireDay;
		return (Date)hireDay.clone();
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	
}
