package _3actionpattern._2betweenclasses._3chainofresponsibility;

/**
 * Created by lm on 16-6-15.
 */
public class Test {

    public static void main(String[] args) {
        MyHandler  h1 = new MyHandler("a");
        MyHandler  h2 = new MyHandler("b");
        MyHandler  h3 = new MyHandler("c");
        MyHandler  h4 = new MyHandler("d");
        MyHandler  h5 = new MyHandler("e");
        MyHandler  h6 = new MyHandler("f");
        MyHandler  h7 = new MyHandler("g");

        h1.setHandler(h2);
        h2.setHandler(h3);
        h3.setHandler(h4);
        h4.setHandler(h5);
        h5.setHandler(h6);
        h6.setHandler(h7);

        h1.operate();

    }

}
