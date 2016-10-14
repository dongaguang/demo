package manager;

import java.text.ParseException;

/**
 * 雇员类的子类:经理类
 * @author Administrator
 *
 */
public class Manager extends Employee {
	private double bonus;//奖金

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

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary(){
		return salary;
	}

}
