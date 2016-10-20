package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * HashSet例子
 * @author Administrator
 *
 */
public class SetTest {
	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		long totalTime = 0;
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		while(sc.hasNext()){
			System.out.println(sc.hasNext());
			String word = sc.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalTime += callTime;
			System.out.println(words.toString());
		}
		Iterator<String> it = words.iterator();
		for (int i = 1; i <= 2 && it.hasNext(); i++) {
			System.out.println(it.next());
		}
		System.out.println(words.size() + "distinct words" + totalTime + "milliseconds");
		System.out.println("...");
	}
}
