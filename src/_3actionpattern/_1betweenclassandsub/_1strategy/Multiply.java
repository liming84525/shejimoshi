package _3actionpattern._1betweenclassandsub._1strategy;

/**
 * Created by lm on 16-6-15.
 */
public class Multiply extends AbstractCalculator implements  Icalculator{

    @Override
    public int calculate(String exp) {
        int[] ary = split(exp, "\\*");
        return ary[0]*ary[1];
    }
}
