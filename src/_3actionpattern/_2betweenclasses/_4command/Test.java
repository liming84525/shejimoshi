package _3actionpattern._2betweenclasses._4command;

/**
 * Created by lm on 16-6-15.
 */
public class Test {
    public static void main(String[] args) {
        Invoker i = new Invoker(new MyCommand(new Receiver()));
        i.action();
    }

}
