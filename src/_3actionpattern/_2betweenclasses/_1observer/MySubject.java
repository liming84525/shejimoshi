package _3actionpattern._2betweenclasses._1observer;

/**
 * Created by lm on 16-6-15.
 */
public class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("update self");
        notifyObserver();
    }
}
