package _3actionpattern._3classstatus._1memento;

/**
 * Created by lm on 16-6-15.
 */
public class Storage {

    private Memento memo;

    public Storage(Memento memo) {
        this.memo = memo;
    }

    public Memento getMemo() {
        return memo;
    }

    public void setMemo(Memento memo) {
        this.memo = memo;
    }
}
