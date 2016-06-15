package _3actionpattern._4middleclass._1visitor;

/**
 * Created by lm on 16-6-15.
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor vis) {
        vis.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
