package _3actionpattern._4middleclass._1visitor;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {

        Visitor vis = new MyVisitor();

        Subject sub = new MySubject();

        vis.visit(sub);
        sub.accept(vis);

    }

}
