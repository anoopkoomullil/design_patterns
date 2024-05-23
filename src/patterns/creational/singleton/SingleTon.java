package patterns.creational.singleton;

public class SingleTon {
    private static SingleTon singleTonInstance = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getSingleTonInstance() {
        return singleTonInstance;
    }

    public  void  getHashCode(){
        System.out.println("The hashcode = "+ singleTonInstance);
    }
}
