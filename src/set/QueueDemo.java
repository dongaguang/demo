package set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class QueueDemo {
	public static void main(String[] args) throws Exception {
//		Queue<String> queue = new LinkedList<String>();
//		queue.add("my");
//		queue.add("is");
//		queue.add("a");
//		queue.add("queue");
		List<String> list = new ArrayList<String>();
		list.add("d");
		list.add("a");
		list.add("b");
		list.add("c");
		ListIterator<String> it = list.listIterator();
		it.next();
		it.add("sdf");
		it.previous();
		it.previous();
		it.add("sdf");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "b"));
		/**
		 * 使用二分查找的列表必须是有序的
		 * 
		 */
		System.out.println(Collections.binarySearch(list, "s"));
		int i = Collections.binarySearch(list, "s");
		if(i < 0){
			i = -i -1;
			list.add(i, "s");
		}
		System.out.println(list);
//		while(it.hasNext()){
//			it.next();
//		}
		//使用ListIterator可以逆向遍历list，但是首先需要把游标定义到列表最后
		max(list);
//		while(it.hasPrevious()){
//			System.out.println(it.previous());
//		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends Comparable> T max(Collection<T> c) throws Exception{
		if(null == c){
			throw new Exception("传入的集合为空");
		}
		Iterator<T> it = c.iterator();
		T largest = it.next();
		while(it.hasNext()){
			T next = it.next();
			if(largest.compareTo(next) < 0){
				largest = next;
			}
		}
		return largest;
	}
}
