package 常用类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 可视化日历程序(第一个版本)
 * @author lhy
 *
 */
public class TestCalendar2 {
	public static void main(String[] args) throws ParseException {
		String str= "2020-10-10";
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = df.parse(str);
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		for(int i = 0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++) {
			System.out.print("\t");
		}
		
		for(int i = 1;i<c.getActualMaximum(Calendar.DATE);i++) {
			
			System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
			
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
				System.out.println();//换行
			}
			
			c.add(Calendar.DAY_OF_MONTH,1);
		}
		
		
	}

}
