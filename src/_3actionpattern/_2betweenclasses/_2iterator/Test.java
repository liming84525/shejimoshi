package _3actionpattern._2betweenclasses._2iterator;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {

        Collection c = new MyCollection();
        Iterator i = c.iterator();
        System.out.println(i.first());
        System.out.println(i.next());
        System.out.println(i.previous());
        System.out.println(i.hasNext());
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
