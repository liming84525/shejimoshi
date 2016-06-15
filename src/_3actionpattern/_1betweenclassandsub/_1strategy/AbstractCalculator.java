package _3actionpattern._1betweenclassandsub._1strategy;

/**
 * Created by lm on 16-6-15.
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String[] arry = exp.split(opt);
        int[] intary = new int[2];
        intary[0] = Integer.parseInt(arry[0]);
        intary[1] = Integer.parseInt(arry[1]);
        return intary;
    }

}
