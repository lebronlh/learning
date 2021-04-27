package genericity.bridgemethod;

import java.util.Date;

class DateInter extends Pair<Date> {

    @Override
    public void setValue(Date value) {
        super.setValue(value);
    }

    @Override
    public Date getValue() {
        return super.getValue();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        DateInter dateInter = new DateInter();
        dateInter.setValue(new Date());
        //表明是子类的方法是重写而不是重载
        //dateInter.setValue(new Object()); //编译错误
    }
}
