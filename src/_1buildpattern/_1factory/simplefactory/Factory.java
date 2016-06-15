package _1buildpattern._1factory.simplefactory;

import _1buildpattern._1factory.entity.MailSender;
import _1buildpattern._1factory.entity.Sender;
import _1buildpattern._1factory.entity.SmsSender;

public class Factory {

    public Sender produce(String type) {

        if ("sms".equals(type)) {
            return new SmsSender();
        } else if ("mail".equals(type))  {
            return new MailSender();
        } else {
            System.out.println("not specify type ");
            return null;
        }

    }

}
