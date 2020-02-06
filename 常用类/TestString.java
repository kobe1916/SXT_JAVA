package 常用类;
//String类代表不可变Unicode字符序列，因此String对象称为不可变对象

public class TestString {
	public static void main(String[] args) {
		/*String str= "aaaaabb";
		
		String str2 = str.substring(2,5);
		
		System.out.println(str);
		System.out.println(str2);*/
		//== 是用来判断是不是同一个对象的   尽量用equals方法
		
		//编译器做了优化 直接在编译的时候将字符串进行拼接
		String str1= "hello"+" java";  //相当于str1 =  "hello java"
		String str2 = "hello java";
		System.out.println(str1==str2);  //true
		String str3 = "hello";
		String str4 = " java";
		//编译的时候不知道变量中存储的是什么所有没办法在编译的时候优化
		String str5 =  str3+str4;
		System.out.println(str2==str5);//false
		System.out.println(str2.equals(str5));  //做字符串比较时候使用equals  不要用==
	}

}
