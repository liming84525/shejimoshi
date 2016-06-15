package _1buildpattern._2singleton.perfectSingleton2;

import java.util.Vector;

/**
 * Created by lm on 16-6-14.
 *
 * ulterly useless
 */
public class Singleton {

    public static Singleton instance = null;
    public static Vector properties = null;

    private Singleton() {
        System.out.println("perfect singleton 2");
    }

    private static synchronized void syncInit() {
        if (instance == null ) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (instance == null ) {
            syncInit();
        }
        return instance;
    }

    public static Object ReadResolve() {
        return getInstance();
    }

    public Vector getProperties() {
        return properties;
    }

    public static void updateProperties() {
        Singleton shadow = new Singleton();
        properties = shadow.getProperties();
    }

}
