package _1buildpattern._4prototype;

import java.io.*;

/**
 * Created by lm on 16-6-14.
 * 原型模式 就是实现Cloneable接口
 * 这是个空借口，随便写方法实现
 * 分成 深克隆， 浅克隆
 *
 */

public class ProtoType implements Cloneable, Serializable{

    public static final long SerialVersionUid = 1l;
    private String str;


    //浅复制
    public  Object clone() throws CloneNotSupportedException {
        ProtoType pt = (ProtoType)super.clone();
        return pt;
    }

    //深复制
    public Object deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出当前对象的二进制流
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
