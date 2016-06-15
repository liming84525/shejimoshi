package _1buildpattern._2singleton.lazysingleton;

/**
 * Created by lm on 16-6-14.
 * 懒汉单例 在并发的情况下， 可能产生竞态，需要同步
 *
 */
public class Singleton {

    public static Singleton instance = null;

    private Singleton() {
        System.out.println("lazy singleton");
    }


    //仅在instance == null 的情况下添加同步锁
    //因为jvm的优化，可能在 instance != null 的时候 没有完成初始化，仅分配了内存
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //添加同步锁， 但每次获取实例都加锁，有性能问题
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            return new Singleton();
//        } else {
//            return instance;
//        }
//    }


    //保持序列化一致 ？？ 为啥
    public Object ReadResolve() {
        return instance;
    }

}
