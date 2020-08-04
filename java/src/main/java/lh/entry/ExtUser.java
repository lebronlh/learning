package lh.entry;

public class ExtUser extends User{
    private  String ttt;
    private  String yyy;

    @Override
    public  void getData(){
        this.setTtt("123");
        this.setYyy("ggg");
    }

    public String getTtt() {
        return ttt;
    }

    public void setTtt(String ttt) {
        this.ttt = ttt;
    }

    public String getYyy() {
        return yyy;
    }

    public void setYyy(String yyy) {
        this.yyy = yyy;
    }

    @Override
    public String toString() {
        return "ExtUser{" +
                "ttt='" + ttt + '\'' +
                ", yyy='" + yyy + '\'' +
                '}';
    }
}
