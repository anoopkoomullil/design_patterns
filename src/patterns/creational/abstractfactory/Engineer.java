package patterns.creational.abstractfactory;

public class Engineer implements Profession {
    @Override
    public void print() {
        System.out.println("In Engineer class");
    }
}
