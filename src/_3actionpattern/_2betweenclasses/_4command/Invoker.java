package _3actionpattern._2betweenclasses._4command;

/**
 * Created by lm on 16-6-15.
 */
public class Invoker {

    Command c = null;

    public Invoker(Command c) {
        this.c = c;
    }

    public void action() {
        System.out.println("invoker action");
        c.exec();
    }

}
