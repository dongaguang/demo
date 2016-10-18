package enumTest;

import java.util.Arrays;

/**
 * 枚举的操作类
 * @author Administrator
 *
 */
public class EnumOperate {
	public static void main(String[] args) {
		String s = Enum.valueOf(Size.class, "SMALL").toString();
		Size[] arr = Size.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getAbbreviation());
		}
		System.out.println(Arrays.toString(arr));
	}
}
