package _1buildpattern._1factory.abstractfactory;

import _1buildpattern._1factory.entity.Sender;
import _1buildpattern._1factory.entity.SmsSender;

/**
 * Created by lm on 16-6-14.
 */
public class SmsFactory implements Provider {

    public Sender provide() {
        return new SmsSender();
    }

}
