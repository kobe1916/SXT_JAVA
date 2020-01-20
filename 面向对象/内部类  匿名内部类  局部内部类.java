package cn.java.oo;


//内部类

/*
内部类： 成员内部类（非静态内部类、静态内部类）、匿名内部类、局部内部类
非静态内部类（外部类里使用非静态内部类和平时使用其他类没有什么不同）
1.非静态内部类必须寄存在一个外部类对象里。因此，如果有一个非静态内部类对象那么一定存在对应的外部类对象
非静态内部类对象单独属于外部类的某个对象
2.非静态内部类可以直接访问外部类的成员，但是外部类不能直接访问非静态内部类成员
3.非静态内部类不能有静态方法、静态属性和静态初始化块
4.外部类的静态方法、静态代码块不能访问非静态内部类，包括不能使用非静态内部类定义变量、创建实例
*/


/*
匿名内部类
  适合那种只需要使用一次的类。比如：键盘监听操作等等
new 父类构造器（实参类表） \实现接口（）{
//匿名内部类类体
}
注意：
1.匿名内部类没有访问修饰符
2.匿名内部类没有构造方法。因为它连名字都没有那又何来构造方法呢
*/

/**
 * 测试匿名内部类
 */

public class TestAnonymousInnerClass {
    public static void test01(AA a){
        a.aa();//在这调用
    }
    public static void main(String[] args){
        TestAnonymousInnerClass.test01(new AA(){//定义类体

            public void aa(){
                System.out.println("aaaaaaaaaa");
            }
        });
    }

}
interface AA{
    void aa();
}




/*

局部内部类
定义在方法内部的，作用域只限于本方法
public class Test2{
    public void show(){
        //作用域仅限于该方法
        class Inner{
            public void fun(){
                System.out.println("hello");
            }
        }
        new Inner().fun();
    }
    public static void main(String[] args){
        new Test2().show();
    }
}

*/
