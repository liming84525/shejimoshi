package _1buildpattern._2singleton.perfectsingleton;

/**
 * Created by lm on 16-6-14.
 */
public class Test {
    //饿汉单例，使用内部类生成实例，保证性能，也不会产生竞态
    // 成功
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton s = Singleton.getInstance();
                }
            });
            t.run();
        }
    }
}
