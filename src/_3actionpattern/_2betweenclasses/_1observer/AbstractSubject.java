package _3actionpattern._2betweenclasses._1observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lm on 16-6-15.
 * 抽象类可以不完全实现接口的方法，可以让子类必须实现
 *
 *
 */
public abstract class  AbstractSubject implements Subject{

    private Vector<Observer> obss = new Vector<Observer>();

    @Override
    public void add(Observer obs) {
        obss.add(obs);
    }

    @Override
    public void remove(Observer obs) {
        obss.remove(obs);
    }

    @Override
    public void notifyObserver() {
        Enumeration<Observer> e = obss.elements();
        while (e.hasMoreElements()) {
            e.nextElement().update();
        }
    }

//    @Override
//    public void operation() {
//        System.out.println("self update");
//    }
}
