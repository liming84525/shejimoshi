package _2infrastracturepattern._5bridge;

import _2infrastracturepattern.Sourceable;

/**
 * Created by lm on 16-6-15.
 */
public abstract class Bridge {

    private Sourceable s;

    public void bridgeMethod() {
        s.method();
    }

    public Sourceable getS() {
        return s;
    }

    public void setS(Sourceable s) {
        this.s = s;
    }
}
