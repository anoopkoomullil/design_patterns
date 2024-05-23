package patterns.creational.factory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("In Doctor class");
    }
}
