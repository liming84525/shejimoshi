package _3actionpattern._1betweenclassandsub._1strategy;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        Plus p = new Plus();
        Minus m = new Minus();
        Multiply mp = new Multiply();

        System.out.println(p.calculate("2+8")+"");
        System.out.println(m.calculate("2-8")+"");
        System.out.println(mp.calculate("2*8")+"");

    }

}
