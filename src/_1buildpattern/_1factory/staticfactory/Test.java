package _1buildpattern._1factory.staticfactory;

import _1buildpattern._1factory.entity.Sender;


/**
 * Created by lm on 16-6-14.
 */
public class Test {

    public static void main(String[] args) {
        Sender s = Factory.produceMail();
        s.send();
        Sender s1 = Factory.produceSms();
        s1.send();
    }

}
