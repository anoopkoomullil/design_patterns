package patterns.creational.singleton;

public class SingleMain {
    public static void main(String[] args) {
        SingleTon obj1 = SingleTon.getSingleTonInstance();
        obj1.getHashCode();
        SingleTon obj2 = SingleTon.getSingleTonInstance();
        obj2.getHashCode();
    }
}
