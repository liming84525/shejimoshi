package _3actionpattern._2betweenclasses._3chainofresponsibility;

/**
 * Created by lm on 16-6-15.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println(name);
        if(getHandler() != null) {
            getHandler().operate();
        } else {
            System.out.println("no more handlers !");
        }
    }
}
