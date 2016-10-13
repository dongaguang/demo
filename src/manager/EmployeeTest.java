package manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		for(Employee el: staff){
			el.raiseSalary(5);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("name:" + el.getName() + "--salary:" + el.getSalary() + "--hireDay:" + sdf.format(el.getHireDay()));
		}
	}
}
