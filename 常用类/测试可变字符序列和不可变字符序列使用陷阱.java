package 常用类;
/**
 * 测试可变字符序列和不可变字符序列使用陷阱
 * @author lhy
 *
 */
public class TestStringBuilder3 {
	public static void main(String[] args) {
		/**使用String进行字符串的拼接*/
		String str8 = "";
		//本质上使用StringBuilder拼接，但是每次循环都会生成一个StringBuilder对象
		long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		long time1 = System.currentTimeMillis();//获取系统当前时间
		for(int i = 0;i<5000;i++) {
			str8 = str8+i;//相当于产生了10000个对象
		}//尽量不要用
		long num2 = Runtime.getRuntime().freeMemory();
		long time2 = System.currentTimeMillis();
		System.out.println("String占用内存："+(num1-num2));
		System.out.println("String占用时间："+(time2-time1));
		
		/**使用String Builder进行字符串的拼接*/
		StringBuilder sb1 = new StringBuilder("");//循环累加字符串一定要用StringBuilder
		long num3 = Runtime.getRuntime().freeMemory();
		long time3 = System.currentTimeMillis();
		for(int i = 0;i<5000;i++) {
			sb1.append(i);
		}
		long num4 = Runtime.getRuntime().freeMemory();
		long time4 = System.currentTimeMillis();
		System.out.println("String占用内存："+(num3-num4));
		System.out.println("String占用时间："+(time4-time3));
		
		
	}

}
