package manager;

import java.text.ParseException;

/**
 * 雇员类的子类:经理类
 * @author Administrator
 *
 */
public class Manager extends Employee {

	/**
	 * 子类的构造器必须要调用父类的构造器
	 * @param n
	 * @param s
	 * @param year
	 * @param month
	 * @param day
	 * @throws ParseException
	 */
	public Manager(String n, double s, int year, int month, int day) throws ParseException {
		super(n, s, year, month, day);
	}

}
