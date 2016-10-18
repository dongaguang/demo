package enumTest;

/**
 * 定义枚举
 * @author Administrator
 *
 */
public enum Size {
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	
	private String abbreviation;
	
	/**
	 * 枚举类的构造器
	 */
	private Size(String abbreviation){
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation(){
		return abbreviation;
	}
}
