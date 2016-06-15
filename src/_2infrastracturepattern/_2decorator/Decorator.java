package _2infrastracturepattern._2decorator;

/**
 * Created by lm on 16-6-15.
 * 思路就是两个类A,B实现同一个借口，在B构造方法里传入另一个A实例，在实现借口的方法中调用A实例的方法，实现B类的实现方法C同时具有A类和B类的同一个实现方法
 *
 * 装饰器模式的应用场景：

 1、需要扩展一个类的功能。

 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）

 缺点：产生过多相似的对象，不易排错！
 */
public class Decorator implements Sourceable{

    private Sourceable s;

    //传入一个实现sourceable借口类型的实例
    public Decorator(Sourceable s){
        super();
        this.s = s;
    }

    //在实现的方法里注入另一个实现该借口的方法
    public void method1() {
        System.out.println("before source");
        s.method1();
        System.out.println("after source");
    }
}
