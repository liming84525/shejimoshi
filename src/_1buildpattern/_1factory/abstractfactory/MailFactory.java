package _1buildpattern._1factory.abstractfactory;

import _1buildpattern._1factory.entity.MailSender;
import _1buildpattern._1factory.entity.Sender;

/**
 * Created by lm on 16-6-14.
 */
public class MailFactory implements Provider {

    @Override
    public Sender provide() {
        return new MailSender();
    }

}
