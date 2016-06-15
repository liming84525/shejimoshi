package _3actionpattern._3classstatus._2state;

/**
 * Created by lm on 16-6-15.
 */
public class Context {

    private State s;

    public Context(State s) {
        this.s = s;
    }

    public State getS() {
        return s;
    }

    public void setS(State s) {
        this.s = s;
    }

    public void method() {
        if (s.getState().equals("state1")) {
            s.method1();
        } else {
            s.method2();
        }
    }

}
