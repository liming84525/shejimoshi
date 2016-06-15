package _3actionpattern._3classstatus._2state;

/**
 * Created by lm on 16-6-15.
 */
public class State {

    private String state;

    public State(String state) {
        this.state = state;
    }

    public void method1() {
        System.out.println("first state");
    }

    public void method2() {
        System.out.println("second state");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
