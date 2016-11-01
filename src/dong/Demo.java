package dong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 遍历List的过程中remove元素
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.hashMap();
	}
	
	public void hashMap(){
		Map<String,String> test = new HashMap<String,String>();
		test.put("1", "a");
		test.put("2", "b");
		test.put("3", "c");
		test.put("4", "d");
		test.put("5", "e");
//		//第一种遍历
//		for(String s: test.keySet()){
//			System.out.println("key:" + s + "value:" + test.get(s));
//		}
//		//第二种遍历:遍历value,只能遍历value
//		for(String s: test.values()){
//			System.out.println("value:" + s);
//		}
//		//第三种
//		for(Entry<String, String> en:test.entrySet()){
//			System.out.println(en.getKey() + "---" + en.getValue());
//		}
		//第四种
		Iterator<Entry<String, String>> it = test.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> en = it.next();
			System.out.println("key:" + en.getKey() + "value:" + en.getValue());
		}
	}
	
	/**
	 * 遍历List
	 */
	public void list(){
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
