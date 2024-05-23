package patterns.behavioral.proxy;

public class ProxyImplimentation extends RealImplimentation{
    @Override
    public void method(){
        System.out.println("Proxy implementation");
        super.method();
    }
}
