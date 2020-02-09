package 常用类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * DateFormate类作用:
 * 把时间对象转化成指定格式的字符串。反之，把指定格式的字符串转化成时间对象
 * 是抽象类  一般使用它的子类SimpleDateFormat类来实现
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 测试时间对象和字符串之间的互相转换
 * DateFormat和SimpleDateFormat实现类的使用
 * @author lhy
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//把时间对象按照“格式字符串指定的格式” 转成相应的字符串
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
				
		String str = df.format(4000000);
		System.out.println(str);
		
		//把字符串按照“格式字符串指定的格式”转成相应的时间对象
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		
		Date date = df2.parse("1983年5月10日 10:45:59");
		System.out.println(date);
		
		//测试其他的格式字符。如：利用D，获得本时间对象是所处年份的第几天
		DateFormat df3 = new SimpleDateFormat("D");
		String str3 = df3.format(new Date());
		System.out.println(str3);
		
	}

}
