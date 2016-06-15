package _3actionpattern._4middleclass._2mediator;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        Mediator m = new MyMediator();
        m.createMediator();
        m.workAll();
    }

}
