package _3actionpattern._4middleclass._1visitor;

/**
 * Created by lm on 16-6-15.
 */
public interface Subject {

    void accept(Visitor vis);

    String getSubject();

}
