package exp;

import dong.DateOperate;

public class ExpOperate {
	public static void main(String[] args){
		try {
			DateOperate date = new DateOperate();
			date.someOperate();
		} catch (BaseException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (Exception e) {
			System.out.println("---");
		}
	}
}
