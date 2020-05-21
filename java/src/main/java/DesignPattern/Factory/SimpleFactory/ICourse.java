package DesignPattern.Factory.SimpleFactory;

/*简单工厂模式适用于工厂类负责创建的对象较少的场景，
且客户端只需要传入工厂类的参数，对于如何创建对象并不关心*/
public interface ICourse {
    //录制视频
    public void record();
}
