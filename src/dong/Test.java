package dong;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {
	public static void main(String[] args) throws ParseException {
//		Test t = new Test();
//		t.isValidDate("2016-2-19 12");
//		System.out.println(t.isValidDate("2016-2-19 12"));
		Pattern p = Pattern.compile("^(([0-9]{1,12})(.\\d{1,2})?)$");
		Matcher m = p.matcher("1.12");
		System.out.println(m.matches());
	}
	
	/** 
     * 判断时间格式 格式必须为“YYYY-MM-dd”
     * 2004-2-30 是无效的 
     * 2003-2-29 是无效的 
     * @param sDate 
     * @return 
     */  
    public boolean isValidDate(String str) {
        //String str = "2007-01-02";  
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        try{  
            Date date = (Date)formatter.parse(str);  
            System.out.println(str);
            System.out.println(formatter.format(date));
            return str.equals(formatter.format(date));  
        }catch(Exception e){//抛异常说明不是日期类型的字符串
            return false;  
        }  
    }
}
