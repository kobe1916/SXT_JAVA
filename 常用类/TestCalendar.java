package 常用类;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 测试日期类的使用
 * @author lhy
 *
 */

/*
 * Calendar类抽象类  提供关于日期计算相关功能 如：年、月、日、时、分、秒的展示和计算
 * GregorianCalendar是Calendar的一个具体子类  
 * 注意月份的表达 0--一月 1--二月  2--三月
 */
public class TestCalendar {
	public static void main(String[] args) {
		//获得日期的相关元素
		Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
		int year = calendar.get(Calendar.YEAR);
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);//星期几 1--周日
		System.out.println(year);
		System.out.println(month); //0-11表示对应的月份
		System.out.println(weekday);
		System.out.println(day);
		
		//设置日期的相关元素
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR,8012);
		
		System.out.println(c2);
		
		//日期的计算
		Calendar c3 = new GregorianCalendar();
		c3.add(Calendar.YEAR, -100);
		System.out.println(c3);
		
		//日期对象和时间对象的转化
		Date d4 = c3.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());
		
		printCalendar(c4);
		
	}
	
	public static void printCalendar(Calendar c) {
		//打印：1919年10月10日 11：23：35  周二
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int dayweek = c.get(Calendar.DAY_OF_WEEK);
		String dayweek2 = dayweek ==0?"日":dayweek+"";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"年"+month+"月"+date+"日"+hour+"时"
		+minute+"分"+second+"秒"+"周"+dayweek2);
		
	}

}
