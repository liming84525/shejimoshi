package _1buildpattern._1factory.entity;

/**
 * Created by lm on 16-6-14.
 */
public class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("send sms");
    }

}
