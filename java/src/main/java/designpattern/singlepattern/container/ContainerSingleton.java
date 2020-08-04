package designpattern.singlepattern.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private  ContainerSingleton(){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    /**
     * 容器式单例模式适用于实例非常多的情况，便于管理。但它是非线程安全的
     * @param className
     * @return
     */
    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;

                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                }  catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else {
                return ioc.get(className);
            }
        }
    }
}
