package functional;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void functIntMethod();

    default  void otherMethod(){
        System.out.println("Other method");
    }
    static void nextMethod(){
        System.out.println("Other static method2");
    }
}
