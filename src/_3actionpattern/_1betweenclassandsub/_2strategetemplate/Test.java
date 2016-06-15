package _3actionpattern._1betweenclassandsub._2strategetemplate;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        AbstractCalculator ac = new Plus();
        String str = "10+10";
        int result = ac.calculate(str,"\\+");
        System.out.println(result);
    }


}
