package java基础.innerclass;

// innerclasses/Parcel2.java
// Returning a reference to an inner class
interface  Contents{
    public int value();
}
public class Parcel2 {


    public Contents contents() {
        return new Contents() { // Insert class definition
            private int i = 11;

            @Override
            public int value() { return i; }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        Contents c = p.contents();
        System.out.println(c.getClass().getName());
    }


}
