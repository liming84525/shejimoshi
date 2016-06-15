package _1buildpattern._2singleton.hungrysingleton;

/**
 * Created by lm on 16-6-14.
 * 饿汉单例 类加载时就创建了对象 在并发的情况下效果好 因为类加载是是互斥的
 */

public class Singleton {

    public static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("hungry singleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        } else {
            return instance;
        }
    }

    //序列化一致
    public Object ReadSolve() {
        return instance;
    }

}
