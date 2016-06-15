package _3actionpattern._2betweenclasses._2iterator;

/**
 * Created by lm on 16-6-15.
 */
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};

    private Iterator i = null;

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
