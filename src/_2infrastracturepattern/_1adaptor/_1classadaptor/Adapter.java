package _2infrastracturepattern._1adaptor._1classadaptor;

/**
 * Created by lm on 16-6-14.
 * 适配器继承一个类A， 同时实现借口B
 * 适配器既是A又是B, 起到了讲一个类的方法拓展到一个接口中
 */
public class Adapter extends Source implements Targetable {

    public void m2() {
        System.out.println("this is adapter");
    }
}
