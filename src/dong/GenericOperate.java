package dong;

public class GenericOperate {
	public static void main(String[] args) {
		String[] words = {"1","2","Msdf","4","5"};
		System.out.println("max:" + ArrayAlp.minmax(words).getSecond());
		System.out.println("min:" + ArrayAlp.minmax(words).getFirst());
	}
}

class ArrayAlp{
	public static Pair<String> minmax(String[] a){
//	public static Pair<Integer> minmax(String[] a){
		if(null == a || a.length == 0){
			return null;
		}
		String min = a[0];
		String max = a[0];
		for(int i = 0; i < a.length; i++){
			if(min.compareTo(a[i]) > 0){
				min = a[i];
			}
			if(min.compareTo(a[i]) < 0){
				max = a[i];
			}
		}
		return new Pair<>(min,max);
//		return new Pair<>(Integer.valueOf(min),Integer.valueOf(max));
	}
}
