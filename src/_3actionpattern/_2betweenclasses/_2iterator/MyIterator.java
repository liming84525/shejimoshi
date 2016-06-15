package _3actionpattern._2betweenclasses._2iterator;

/**
 * Created by lm on 16-6-15.
 */
public class MyIterator implements  Iterator{

    private Collection c = null;
    private int pos = -1;

    public MyIterator(Collection c) {
        this.c = c;
    }

    @Override
    public Object previous() {
        if (pos > 0 ) {
            pos--;
        }
        return c.get(pos);
    }

    @Override
    public Object next() {
        if (pos < c.size()-1) {
            pos++;
        }
        return c.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < c.size()-1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return c.get(pos);
    }
}
