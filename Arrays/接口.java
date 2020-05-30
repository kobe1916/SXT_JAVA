/*
定义接口详细说明：
1.访问修饰符：只能是public或默认
2.接口名：和类名采用相同命名机制
3.extends：接口可以多继承
4.常量：接口中属性只能是常量，总是：public static final修饰。不写也是
5.方法：接口中方法只能是：public abstract 省略的话也是public abstract



要点：
1.子类通过implements来实现接口中的规范
2.接口不能创建实类，但是可用于声明引用变量类型
3.一个类实现了接口，必须实现接口中所有的方法，并且这些方法只能是public的

*/
public interface MyInterface {
	/* public static final*/int maxAge = 100;
	 
	/*public abstract*/ void test01();

}

class MyClass implements MyInterface{

	@Override
	public void test01() {     //这个方法我们必须重写
		// TODO Auto-generated method stub
		System.out.println(maxAge);
		System.out.println("123");
	}
	
}


package 类;

/**
 * 测试接口和实现类
 * @author lhy
 *
 */

//   类只能单继承，接口可以多继承

public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angel();
		v.fly();
		
		Honest h = new GoodMan();
		h.helpOther(); 
	}

}

interface Volant{
	int Fly_Heighe = 100;
	void fly();
}

interface Honest{
	void helpOther();
}

class Angel implements Volant,Honest{//实现类可以实现多个父接口

	@Override
	public void helpOther() {
		// TODO Auto-generated method stub
		System.out.println("Angel.helpOther()");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Angel.fly()");
	}
	
}

class GoodMan implements Honest{

	@Override
	public void helpOther() {
		// TODO Auto-generated method stub
		System.out.println("GoodMan.helpOther");
	}
}

class BirdMan implements Volant{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("BiraMan.fly()");
	}
}
