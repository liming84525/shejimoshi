package _3actionpattern._3classstatus._1memento;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        Original o = new Original("hello world");
        System.out.println(o.getValue());
        Storage s = new Storage(o.createMemo());
        o.setValue("hello again");
        System.out.println(o.getValue());
        o.restoreMemo(s.getMemo());
        System.out.println(o.getValue());
    }

}
