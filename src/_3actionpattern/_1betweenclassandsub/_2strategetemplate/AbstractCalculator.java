package _3actionpattern._1betweenclassandsub._2strategetemplate;

/**
 * Created by lm on 16-6-15.
 * 子类实现抽象方法，就是这个意思
 *
 */
public abstract class AbstractCalculator {

    public final int calculate(String exp, String opt) {
        int[] ary = split(exp,opt);
        return calculate(ary[0], ary[1]);
    }

    public abstract int calculate(int a, int b);


    //重复上一个代码
    public int[] split(String exp, String opt) {
        String[] arry = exp.split(opt);
        int[] intary = new int[2];
        intary[0] = Integer.parseInt(arry[0]);
        intary[1] = Integer.parseInt(arry[1]);
        return intary;
    }

}
