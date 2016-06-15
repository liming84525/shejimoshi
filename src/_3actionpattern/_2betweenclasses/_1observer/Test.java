package _3actionpattern._2betweenclasses._1observer;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        Subject s = new MySubject();
        s.add(new ObserverImpl1());
        s.add(new ObserverImpl2());
        s.operation();
    }

}
