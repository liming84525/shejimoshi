package _3actionpattern._4middleclass._1visitor;

/**
 * Created by lm on 16-6-15.
 */
public class MyVisitor implements  Visitor{

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
