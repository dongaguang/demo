package dong;

/**
 * Hello GitHub
 * @author Administrator
 *
 */
public class HelloGitHub {
	enum PokerColor{A,B}
	public static void main(String[] args) {
		final int S = 21;
		System.out.println("This is commit to GitHub");
		int i = 0b11111;//JDK1.7以后可以使用
		System.out.println(i);
		Double f = 4d;
		System.out.println(Double.NaN);
		char c = '\u005e';
		System.out.println(Math.sqrt(f));
		PokerColor pc = PokerColor.A;
	}
}
