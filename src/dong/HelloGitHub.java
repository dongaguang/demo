package dong;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello GitHub
 * @author Administrator
 *
 */
public class HelloGitHub {
	public static void main(String[] args) throws IOException {
		HelloGitHub hg = new HelloGitHub(); 
//		hg.getInfoWithIn();
//		hg.operateFile();
		hg.operateArray();
	}
	
	/**
	 * 数组工具类Arrays
	 */
	private void operateArray(){
		int[] a = new int[100];
		for(int i = 0; i < a.length; i++){
			a[i] = i;
		}
		System.out.println(Arrays.toString(a));
	}
	
	/**
	 * 文件的读取和写入
	 * @throws IOException 
	 */
	private void operateFile() throws IOException{
		//Scanner一般用于标准输入输出
		Scanner sc = new Scanner(Paths.get("F:\\hello.txt"));
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();
		
		//写入文件
		PrintWriter pw = new PrintWriter("F:\\my.txt");
		try {
			pw.print("你是我的眼sdfsdfsd");
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			pw.close();
		}
	}
	
	/**
	 * 获取标准输入的姓名和年龄，并输出
	 */
	@SuppressWarnings("unused")
	private void getInfoWithIn(){
		System.out.println("please enter you name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("please enter you age:");
		String age = sc.nextLine();
		System.out.println("Hello " + name + ",your age is:" + age);
		sc.close();
		
		/**
		 * Console只能用在标准输入、输出流未被重定向的原始控制台中使用
		 */
//		Console sc = System.console();
//		char[] pass = sc.readPassword();
//		System.out.println(pass.toString());
	}
}
