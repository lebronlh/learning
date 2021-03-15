package designpattern.singlepattern;

public enum SingletonEnum {
     instance;

     public static SingletonEnum getInstance(){
         return instance;
     }


}
