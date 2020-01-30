package cn.java.oo;

			//构造方法重载

//重载含义： Java中如果有功能类似，可以使用相同的名字来定义不同的功能方法

public class User {
    //成员变量
    int id;//id
    String name;//账户名
    String pwd;//密码

    //重载：方法名相同、形参列表不同    //构造器重载跟方法重载没有什么两样
    public User(){
    }
    public User(int id/*局部变量*/,String name){
        //super();   构造方法的第一句总是super()
        this.id = id;//this表示创建好的对象   this.id 指成员变量
        this.name = name;
    }
    public User(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    public static void main(String[] args){
        User u1= new User();
        User u2 = new User (101,"高小七");
        User u3 = new User(100,"高崎","13456");
    };
}

//重写是子类对所继承父类相同方法的一种更改，
//这个更改需要遵循格式按照父类的格式，访问权限，
//抛出异常等等，都在父类方法控制范围内，内部具体实现可以实现不同的效果。
