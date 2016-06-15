package _3actionpattern._4middleclass._3interpreter;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        Context con = new Context(1,2);

        Expression e1 = new Plus();
        Expression e2 = new Minus();

        System.out.println(e1.interpret(con));
        System.out.println(e2.interpret(con));

    }

}
