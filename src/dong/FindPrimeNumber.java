package dong;

import java.util.BitSet;

/**
 * 找素数的算法
 * @author Administrator
 *
 */
public class FindPrimeNumber {
	public static void main(String[] args) {
//		FindPrimeNumber fpn = new FindPrimeNumber();
//		fpn.findPrime(5);
		for (int i = 2; i < 10; i++) {
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					System.out.println(i);
				}
			}
		}
	}

	private void findPrime(int n){
		long start = System.currentTimeMillis();
		BitSet b = new BitSet(n + 1);
		int count = 0;
		int i;
		for(i = 2; i < n; i++){
			b.set(i);
		}
		i = 2;
		while(i * i <= n){
			if(b.get(i)){
				count++;
				int k = 2 * i;
				while(k <= n){
					b.clear(k);
					k += i;
				}
			}
			i++;
		}
		while(i <= n){
			if(b.get(i)){
				count++;
			}
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
		System.out.println(count);
	}
}
