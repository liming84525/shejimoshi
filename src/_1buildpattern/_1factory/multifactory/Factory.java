package _1buildpattern._1factory.multifactory;

import _1buildpattern._1factory.entity.MailSender;
import _1buildpattern._1factory.entity.Sender;
import _1buildpattern._1factory.entity.SmsSender;

/**
 * Created by lm on 16-6-14.
 */

//multi factory method to avoid null pointer
public class Factory {

    public Sender produceSms() {
        return new SmsSender();
    }

    public Sender produceMail() {
        return new MailSender();
    }

}
