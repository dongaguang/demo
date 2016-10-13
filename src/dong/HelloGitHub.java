package dong;

import java.io.Console;
import java.util.Scanner;

/**
 * Hello GitHub
 * @author Administrator
 *
 */
public class HelloGitHub {
	public static void main(String[] args) {
		HelloGitHub hg = new HelloGitHub(); 
		hg.getInfoWithIn();
	}
	
	/**
	 * 获取标准输入的姓名和年龄，并输出
	 */
	private void getInfoWithIn(){
		System.out.println("please enter you name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("please enter you age:");
		String age = sc.nextLine();
		System.out.println("Hello " + name + ",your age is:" + age);
		
		/**
		 * Console只能用在标准输入、输出流未被重定向的原始控制台中使用
		 */
//		Console sc = System.console();
//		char[] pass = sc.readPassword();
//		System.out.println(pass.toString());
	}
}
