package patterns.behavioral.proxy;

public class ProxyDPMain {
    public static void main(String[] args) {
        Subject subject = new ProxyImplimentation();
        subject.method();
    }
}
