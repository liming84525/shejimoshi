package _2infrastracturepattern._3proxy;

/**
 * Created by lm on 16-6-15.
 * 与装饰器模式的区别就是，不能动态制定装饰哪个类。在构造方法里没有传入需要的类，而是在代理类中制定好了的
 * 代理模式的应用场景：

 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：

 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。

 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。

 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 */
public class Proxy implements Sourceable{

    private Source s;

    public Proxy() {
        super();
        this.s = new Source();
    }

    public void method1() {
        before();
        s.method1();
        after();
    }

    private void after() {
        System.out.println("proxy do before");
    }

    private void before() {
        System.out.println("proxy do after");
    }

}
