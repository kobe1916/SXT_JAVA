package Arrays;

public class TestArrayCopy {
	public static void main(String[] args) {
		//testBasicCopy2();
		String[] str = {"ali","jd","sxt","bd","ymx"};
		
		removeElment(str,1);
		str = extendRange(str);
	}
	
	public static void testBasicCopy() {
		String[] s1 = {"aa","bb","cc","dd","ee"};
		String[] s2 = new String[10];
		
		System.arraycopy(s1, 2,s2,6,3);
		
		for(int i = 0;i<s2.length;i++) {
			System.out.println(i+"--"+s2[i]);
		}
	}
	
	//测试从数组中删除某个元素（本质上还是数组的拷贝）   覆盖即删除
		/*public static void testBasicCopy2() {
			String[] s1 = {"aa","bb","cc","dd","ee"};//把cc删掉
			String[] s2 = new String[5];
			
			System.arraycopy(s1, 3,s2,3-1,s1.length-3);
			
			for(int i = 0;i<s2.length;i++) {
				System.out.println(i+"--"+s2[i]);
			}
		
	}*/
	



	public static String[] removeElment(String[] s,int index) {
		
		System.arraycopy(s, index+1,s,index-1,s.length-index-1);
	
		s[s.length-1] = null;
	
		for(int i = 0;i<s.length;i++) {
			System.out.println(i+"--"+s[i]);
		}

		return s;
	}
	
	//数组的扩容（本质上：先定义一个更大的数组，然后将原数组内容原封不动拷贝到新数组中）
	public static String[] extendRange(String[] s1) {
		//String[] s1 = {"aa","bb","cc"};
		
		String[] s2 = new String[s1.length+10];
		
		System.arraycopy(s1, 0, s2, 0, s1.length);//就将s1中所有元素拷贝到s2中
		
		for(String temp:s2) {
			System.out.println(temp);
		}
		return s2;
	}
}



//插入元素
