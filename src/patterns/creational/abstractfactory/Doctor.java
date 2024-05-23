package patterns.creational.abstractfactory;

public class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("In Doctor class");
    }
}
