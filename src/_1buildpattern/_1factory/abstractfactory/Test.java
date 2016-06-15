package _1buildpattern._1factory.abstractfactory;

import _1buildpattern._1factory.entity.Sender;

/**
 * Created by lm on 16-6-14.
 */
public class Test {

    public static void main(String[] args) {
        MailFactory mf = new MailFactory();
        Sender s = mf.provide();
        s.send();
    }
}
