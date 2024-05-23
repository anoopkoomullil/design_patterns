package patterns.behavioral.proxy;

public class RealImplimentation implements Subject{

    @Override
    public void method() {
        System.out.println("I am the real implementation rests are proxies");
    }
}
