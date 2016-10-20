package set;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class QueueDemo {
	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<String>();
//		queue.add("my");
//		queue.add("is");
//		queue.add("a");
//		queue.add("queue");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		ListIterator<String> it = list.listIterator();
		it.next();
		it.add("sdf");
		it.previous();
		it.previous();
		it.add("sdf");
		while(it.hasNext()){
			it.next();
		}
		//使用ListIterator可以逆向遍历list，但是首先需要把游标定义到列表最后
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}
}
