package dong;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 遍历List的过程中remove元素
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		for (int i = 0; i < list.size(); i++) {
			if("2".equals(list.get(i))){
				list.remove(i);
				i--;//i--的目的是防止漏掉元素，list删除一个元素以后后面的元素会前进一个位置
			}
		}
		/**
		 * 这样遍历list会报异常
		 * java.util.ConcurrentModificationException
		 */
//		for(String s:list){
//			if("2".equals(s)){
//				list.remove(s);
//			}
//		}
//		Iterator<String> it  = list.iterator();
//		while(it.hasNext()){
//			if("2".equals(it.next())){
//				it.remove();
//			}
//		}
		System.out.println(list.toString());
	}
	
}
