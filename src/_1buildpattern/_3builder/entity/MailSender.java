package _1buildpattern._3builder.entity;

/**
 * Created by lm on 16-6-14.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("send mail");
    }
}
