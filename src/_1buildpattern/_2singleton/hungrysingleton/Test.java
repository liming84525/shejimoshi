package _1buildpattern._2singleton.hungrysingleton;

/**
 * Created by lm on 16-6-14.
 */
public class Test {
    public static void main(String[] args) {
        //测试在多线程下，运行情况
        //饿汉单例正常
        for (int i = 0; i<=100; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton s = Singleton.getInstance();
                }
            });
            t.start();
        }
    }
}
