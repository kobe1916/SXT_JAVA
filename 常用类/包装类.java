package 常用类;
/**
 * 测试包装类
 * @author lhy
 *
 */

public class TestWrappedClass {
	public static void main(String[] args) {
		//基本数据类型转成包装类对象
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		
		//把包装类对象转成基本数据类型
		int c= b.intValue();
		double d = b.doubleValue();
		
		//把字符串转成包装类对象
		Integer e =  new Integer("999");
		Integer f = Integer.parseInt("9998");
		
		//把包装类对象转成字符串
		String str = f.toString(); //""+f
		
		//常见的常量
		System.out.println("int类型最大的整数"+Integer.MAX_VALUE);
		
		
	}

}

/*   基本数据类型       包装类
 *      byte		Byte
 *      boolean     Boolean
 *      short  		Short
 *      char		Character
 *      int 		Integer
 *      long 		Long
 *      float		Float
 *      double 		Double
 *      */
