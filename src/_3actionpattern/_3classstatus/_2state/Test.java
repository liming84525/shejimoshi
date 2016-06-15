package _3actionpattern._3classstatus._2state;

/**
 * Created by lm on 16-6-15.
 */
public final class Test {

    public static void main(String[] args) {
        Context c = new Context(new State("state1"));
        c.method();
        c.setS(new State("other"));
        c.method();
    }


}
