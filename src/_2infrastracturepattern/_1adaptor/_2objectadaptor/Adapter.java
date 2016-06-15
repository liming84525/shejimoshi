package _2infrastracturepattern._1adaptor._2objectadaptor;

/**
 * Created by lm on 16-6-14.
 */
public class Adapter implements Targetable {

    private Source s = new Source();

    public void m1() {
        s.m1();
    }

    public void m2() {
        System.out.println("this is adpater");
    }

}
