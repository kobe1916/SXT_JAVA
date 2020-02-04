
public class StringTest1 {
	public static void main(String[] args) {
		String s1 = "core java";
		String s2 = "Core java";
		System.out.println(s1.charAt(3));  //提取下标为3的字符
		System.out.println(s2.length());   //字符串的长度
		System.out.println(s1.contentEquals(s2));  //比较字符串是否相等
		System.out.println(s1.equalsIgnoreCase(s2)); //比较两个字符串（忽略大小写）
		System.out.println(s1.indexOf("Java"));//字符串s1是否包含Java
		System.out.println(s1.indexOf("apple"));//
		String s = s1.replace(' ','&'); //将s1中空格替换成&
		System.out.println("result is:"+s);
	}

}





public class StringTest2 {
	public static void main(String[] args) {
		String s = "";
		String s1  = "How are you?";
		System.out.println(s1.startsWith("HOw"));   //是否以How开头
		System.out.println(s1.endsWith("you"));    //是否以you结尾
		s = s1.substring(4);  //提取子字符串，从小标为4的开始到字符串结尾为止
		System.out.println(s);
		s = s1.substring(4,7);//提取子字符串，下标[4,7),不包括7
		System.out.println(s);
		s = s1.toLowerCase(); //转小写
		System.out.println(s);
		s = s1.toUpperCase();  //转大写
		System.out.println(s);
		String s2 = " How old are you!! ";
		s = s2.trim();   //去除字符串首尾空格  中间的空格不能去除
		System.out.println(s);
		System.out.println(s2);  //因为String是不可变字符串，所以s2不变
		
	}

}
