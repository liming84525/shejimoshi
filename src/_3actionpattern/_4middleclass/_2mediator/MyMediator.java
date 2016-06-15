package _3actionpattern._4middleclass._2mediator;

/**
 * Created by lm on 16-6-15.
 */
public class MyMediator implements Mediator {

    private User1 u1;
    private User2 u2;


    public User getUser1() {
        return u1;
    }

    public User getUser2() {
        return u2;
    }

    @Override
    public void createMediator() {
        u1 = new User1(this);
        u2 = new User2(this);
    }

    @Override
    public void workAll() {
        u1.work();
        u2.work();
    }
}
