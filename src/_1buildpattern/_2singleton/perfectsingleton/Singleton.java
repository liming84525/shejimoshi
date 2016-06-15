package _1buildpattern._2singleton.perfectsingleton;

/**
 * Created by lm on 16-6-14.
 * 由于类加载互斥，使用内部类来初始化单例， 缺点是不能更新类的属性
 */
public class Singleton {

    //构造方法私有
    private Singleton() {
        System.out.println("perfect singleton");
    }

    //私有内部类产生实例
    private static class SingletonFactory {

        private static Singleton instance = new Singleton();

    }

    //获得实例时，通过内部类获得实例，这时由于类加载互斥，不会产生竞态, 同时在需要时才会被生产出来，保证了性能
    public static Singleton getInstance() {
        return new SingletonFactory().instance;
    }

    //序列化一致性
    public Object ReadResolve() {
        return getInstance();
    }

}
