package _1buildpattern._3builder;

import _1buildpattern._3builder.entity.MailSender;
import _1buildpattern._3builder.entity.Sender;
import _1buildpattern._3builder.entity.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lm on 16-6-14.
 * 建造者和工厂模式的区别
 * 工厂专注于生产符合条件的一个实例
 * 建造者生产复合类型的对象
 *
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int quantity) {
        for (int i = 0; i < quantity ; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int quantity) {
        for (int i = 0; i < quantity ; i++) {
            list.add(new SmsSender());
        }
    }

}
