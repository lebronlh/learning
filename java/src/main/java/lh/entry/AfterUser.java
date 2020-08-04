package lh.entry;

public class AfterUser extends  ExtUser {
    private String aaa;

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    @Override
    public void getData() {
        this.setAaa("777");
    }

    @Override
    public String toString() {
        return "AfterUser{" +
                "aaa='" + aaa + '\'' +
                '}';
    }
}
