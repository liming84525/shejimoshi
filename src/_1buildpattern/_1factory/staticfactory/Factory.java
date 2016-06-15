package _1buildpattern._1factory.staticfactory;

import _1buildpattern._1factory.entity.MailSender;
import _1buildpattern._1factory.entity.Sender;
import _1buildpattern._1factory.entity.SmsSender;

/**
 * Created by lm on 16-6-14.
 */
public class Factory {

    public static Sender produceSms() {
        return new SmsSender();
    }

    public static Sender produceMail() {
        return new MailSender();
    }


}
