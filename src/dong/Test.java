package dong;

import java.math.BigDecimal;
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
		BigDecimal s = new BigDecimal("0");
		System.out.println(s.compareTo(BigDecimal.ZERO));
	}
}
