package _1buildpattern._1factory.multifactory;

import _1buildpattern._1factory.entity.Sender;

/**
 * Created by lm on 16-6-14.
 */
public class Test {

    public static void main(String[] args) {
        Factory f = new Factory();
        Sender s = f.produceMail();
        s.send();
    }
}
