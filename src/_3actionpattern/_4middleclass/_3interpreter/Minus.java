package _3actionpattern._4middleclass._3interpreter;

/**
 * Created by lm on 16-6-15.
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context con) {

        int num1 = con.getNum1();
        int num2 = con.getNum2();

        return num1 - num2;
    }
}
