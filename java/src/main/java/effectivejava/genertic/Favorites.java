package effectivejava.genertic;

import java.util.*;

public class Favorites {
    private Map<Class<?>,Object> favorites = new HashMap<>();


    public <T> void putFavorite(Class<T> type, T instance){
        favorites.put(Objects.requireNonNull(type),instance);
    }

    public <T> T getFavorite(Class<T> type){
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(String.class,"123");
        f.putFavorite(String.class,"456");
        f.putFavorite(Integer.class,456);
        System.out.println(f.getFavorite(String.class));
        System.out.println(f.getFavorite(Integer.class));
    }
}
