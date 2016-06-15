package _3actionpattern._4middleclass._2mediator;

/**
 * Created by lm on 16-6-15.
 */
public class User1 extends User {

    public User1(Mediator med) {
        super(med);
    }

    @Override
    public void work() {
        System.out.println("user1 work");
    }
}
