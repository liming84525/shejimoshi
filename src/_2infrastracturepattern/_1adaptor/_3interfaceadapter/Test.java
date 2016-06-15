package _2infrastracturepattern._1adaptor._3interfaceadapter;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        Sourceable s1 = new SourceSub2();
        Sourceable s2 = new SouceSub1();

        s1.m1();
        s1.m2();
        s2.m1();
        s2.m2();

    }

}
