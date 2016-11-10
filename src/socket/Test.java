package socket;

import java.net.InetAddress;

public class Test {
	public static void main(String[] args) throws Exception {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia);
	}
}
