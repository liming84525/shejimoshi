package _2infrastracturepattern._4facade;

/**
 * Created by lm on 16-6-15.
 * 外观模式
 * 总体管理其他一些相关类的类，相当于配置程序
 * 外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口，看下类图：（我们以一个计算机的启动过程为例）
 *
 */
public class Computer {

    Cpu c = new Cpu();
    Memory m = new Memory();
    Disk d = new Disk();

    public void startUp() {
        System.out.println("computer startup");
        c.startUp();
        m.startUp();
        d.startUp();
    }

    public void shutDown(){
        c.shutDown();
        m.shutDown();
        d.shutDown();
        System.out.println("computer shutdown");
    }


}
