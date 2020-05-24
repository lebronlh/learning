package designpattern.factory.factorymethod;

import designpattern.factory.ICourse;

/*工厂方法主要解决产品扩展问题，专人干专事，同时也对工厂进行抽象*/
public interface IcourseFactory {
    ICourse create();
}
