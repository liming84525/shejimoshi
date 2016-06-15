package _2infrastracturepattern._5bridge;

import _2infrastracturepattern.Sourceable;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        MyBridge b = new MyBridge();
        Sourceable s1 = new SourceSub1();
        Sourceable s2 = new SourceSub2();

        b.setS(s1);
        b.method();

        b.setS(s2);
        b.method();
    }

}
