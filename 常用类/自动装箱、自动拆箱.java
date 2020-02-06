package 常用类;

public class TestAutoBox {
	public static void main(String[] args) {
		Integer a = 234;  //装箱：Integer a = Integer.valueOf(234);
		
		int b = a;   //拆箱：int b = a.intValue();
		
		/*Integer c = null;
		int d = c;     //自动拆箱：调用了c.intValue();
		*/
		
		//缓存【-128，127】之间的数字    实际就是系统初始的时候，创建了[-128,127]之间的数组
		//当我们调用valueOf（）的时候，首先检查是否在[-128,127]之间，如果在这个范围则直接从缓存数组中拿出已经建好的对象
		//如果不在这个范围，则创建新的Integer对象
		Integer in1 = 123;
		Integer in2= 123;
		System.out.println(in1==in2);//true 因为123在缓存范围内
		System.out.println(in1.equals(in2));//true
		System.out.println("########");
		Integer in3 = 1234;
		Integer in4= 1234;
		System.out.println(in3==in4);//false 因为1234不在缓存范围内
		System.out.println(in3.equals(in4));//true
	}
}



/*
 * 自动装箱：基本类型的数据处于需要对象的环境中时，会自动转为“对象”
eg Integer i - 5；等效于   Integer i - Integer.valueOf(5);

自动拆箱：每当需要一个值时，对象会自动转成基本数据类型,没必要再去显式调用IntValue（）、doubleValue()等转型方法
eg  Integer I= 5； int j = i；

自动装箱过程是通过调用包装类的valueOf（）方法是实现的，而自动拆箱过程是通过调用包装类的xxxValue()方法实现的（xxx代表对应的基本数据类型，如intValue（）、doubleValue（）等）
*/
