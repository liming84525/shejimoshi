package _3actionpattern._2betweenclasses._4command;

/**
 * Created by lm on 16-6-15.
 */
public class MyCommand implements Command{

    private Receiver r = null;

    public MyCommand(Receiver r) {
        this.r = r;
    }

    @Override
    public void exec() {
        System.out.println("mycommand exec");
        r.action();
    }

}
