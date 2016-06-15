package _3actionpattern._4middleclass._2mediator;

/**
 * Created by lm on 16-6-15.
 */
public abstract class User {

    private Mediator med;

    public abstract void work();

    public User(Mediator med) {
        this.med = med;
    }


    public Mediator getMed() {
        return med;
    }

    public void setMed(Mediator med) {
        this.med = med;
    }
}
