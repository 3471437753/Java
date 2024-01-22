package chapter04;

public class Java12_object_Extends_2 {
    public static void main(String[] args) {

        // TODO 面向对象 - Extends(继承)
        // 构造方法
        // 父类对象是在子类对象创建前创建完成的,创建子类对象前会调用父类的构造方法完成父类的创建
        // 默认情况下,子类对象构造时,会默认调用父类的构造方法完成父类对象的创建,使用的时super的方式,只不过JVM自动完成
        //如果父类提供构造方法,那么JVM不会提供默认的构造方法,那么子类应该显示调用super方法构造父类对象
        Child2 c1 = new Child2();
        Child2 c2 = new Child2();
        Child2 c3 = new Child2();

        //new : 构建一个对象
    }
}
class  Parent2{

    Parent2(String name){
        System.out.println("parent...");
    }
}
class Child2 extends Parent2 {

    Child2(){
        super("zhangsan");
        System.out.println("child...");
    }
}