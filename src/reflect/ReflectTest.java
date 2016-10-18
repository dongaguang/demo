package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * 反射操作
 * 打印一个类的全部信息
 * @author Administrator
 *
 */
public class ReflectTest {
	public static void main(String[] args) {
		String name;
		if(args.length > 0){
			name = args[0];
		}else{
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入类名:");
			name = sc.next();
		}
		try {
			Class cl = Class.forName(name);//用户输入的类名
			Class scl = cl.getSuperclass();//该类的父类
			String modifiers = Modifier.toString(cl.getModifiers());
			if(modifiers.length() > 0){
				System.out.print(modifiers + " ");
			}
			System.out.print("class " + name);
			if(null != scl && Object.class != scl){
				System.out.print("extends" + scl.getName());
			}
			System.out.print("\n{\n");
			System.out.print("    //该类的构造方法");
			printConstructors(cl);
			System.out.println();
			System.out.print("    //该类的方法");
			printMethods(cl);
			System.out.println();
			System.out.print("    //该类或其父类的公有域");
			System.out.println();
			printFields(cl);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		for(Field f: fields){
			Class type = f.getType();
			String name = f.getName();
			System.out.print("    ");
			String modifiers = Modifier.toString(cl.getModifiers());
			if(modifiers.length() > 0){
				System.out.print(modifiers + " ");
			}
			System.out.println(type.getName() + "" + name + ";");
		}
	}

	/**
	 * 打印方法
	 * @param cl
	 */
	private static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		for(Method mt: methods){
			Class returnType = mt.getReturnType();
			String name = mt.getName();
			System.out.println("");
			String modifiers = Modifier.toString(mt.getModifiers());
			if(modifiers.length() > 0){
				System.out.print("    " + modifiers + " ");
			}
			System.out.print(returnType.getName() + "" + name + "(");
			//打印参数类型
			Class[] paramTypes = mt.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				if(i > 0){
					System.out.print(", ");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(")");
		}
	}

	/**
	 * 打印所有的构造器
	 * @param cl
	 */
	private static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();
		for(Constructor cs: constructors ){
			String name = cs.getName();
			System.out.println("");
			String modifiers = Modifier.toString(cs.getModifiers());
			if(modifiers.length() > 0){
				System.out.print("    " + modifiers + " ");
			}
			System.out.print(name + "(");
			
			//打印参数类型
			Class[] paramTypes = cs.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				if(i > 0){
					System.out.print(", ");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(")");
		}
	}
}
