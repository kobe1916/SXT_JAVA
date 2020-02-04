/**
 * 测试String类、常量池、字符串比较
 * @author lhy
 *
 */
/*
 * 1.String类又称作不可变字符序列
2.String位于java.lang 包中，Java程序默认导入java.lang 包下所有类
3.Java字符都是Unicode编码
4.Java没有内置的字符串类型，每个用双引号括起来的字符串都是String类的一个实例
 */
public class TestString {
	public static void main(String[] args) {
		String str = "abc";
		String str2 = new String("def");
		String str3 = "abc"+"efg";
		String str4 = "18"+19;   //   +  字符串连接符
		System.out.println(str4);
		
		System.out.println("####");
		String str10="gaoqi";
		String str11 = "gaoqi";
		String str12 = new String("gaoqi");
		
		System.out.println(str10 ==str11);
		System.out.println(str12 == str11);  //11和12不是同一个对象
	//通常比较字符串相等时，使用equals
		System.out.println(str12.contentEquals(str11));
	}

}
