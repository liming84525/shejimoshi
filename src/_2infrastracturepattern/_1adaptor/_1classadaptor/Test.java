package _2infrastracturepattern._1adaptor._1classadaptor;

/**
 * Created by lm on 16-6-14.
 */
public class Test {

    public static void main(String[] args) {
        Targetable t = new Adapter();
        t.m1();
        t.m2();
    }

}
