package _2infrastracturepattern._2decorator;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {

        Sourceable s = new Decorator(new Source());

        s.method1();
    }

}
