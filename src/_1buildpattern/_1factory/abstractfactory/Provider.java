package _1buildpattern._1factory.abstractfactory;

import _1buildpattern._1factory.entity.Sender;

/**
 * Created by lm on 16-6-14.
 * resolve each time add a new entity the factory must be edided
 *
 */

public interface Provider {

    public Sender provide();

}
