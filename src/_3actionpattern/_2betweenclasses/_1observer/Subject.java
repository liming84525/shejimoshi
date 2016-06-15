package _3actionpattern._2betweenclasses._1observer;

/**
 * Created by lm on 16-6-15.
 */
public interface Subject {

    void add(Observer obs);

    void remove(Observer obs);

    void notifyObserver();

    void operation();

}
