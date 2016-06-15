package _3actionpattern._4middleclass._2mediator;

/**
 * Created by lm on 16-6-15.
 */
public class User2 extends User {

    public User2(Mediator med) {
        super(med);
    }

    @Override
    public void work() {
        System.out.println("user2 work");
    }
}
