package jsonapplication;

import com.google.gson.Gson;
import lh.entry.User;

public class GsonDemo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        User u1 = new User();
        u1.setName("lh");
        System.out.println(gson.toJson(u1));
    }
}
