package _3actionpattern._3classstatus._1memento;

/**
 * Created by lm on 16-6-15.
 */
public class Original {

    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemo() {
        return new Memento(value);
    }

    public void restoreMemo(Memento m) {
        this.value = m.getMemento();
    }

}
