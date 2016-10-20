package set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		for(int i = 0; i < 10; i++){
			map.put(i + "", i + "he");
		}
		Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
