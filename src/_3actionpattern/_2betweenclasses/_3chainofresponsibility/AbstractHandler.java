package _3actionpattern._2betweenclasses._3chainofresponsibility;

/**
 * Created by lm on 16-6-15.
 */
public class AbstractHandler {

    private Handler h = null;

    public AbstractHandler() {
    }

    public Handler getHandler() {
        return h;
    }

    public void setHandler(Handler h) {
        this.h = h;
    }


}
