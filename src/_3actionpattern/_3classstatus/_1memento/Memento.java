package _3actionpattern._3classstatus._1memento;

/**
 * Created by lm on 16-6-15.
 */
public class Memento {

    private String memento;

    public Memento(String memo) {
        this.memento = memo;
    }

    public String getMemento() {
        return memento;
    }

    public void setMemento(String memento) {
        this.memento = memento;
    }
}
