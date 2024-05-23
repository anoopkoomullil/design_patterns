package patterns.creational.abstractfactory;

import java.util.Optional;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Optional<Profession> profession = Optional.ofNullable(abstractFactory.getProfession("TraineeEngineer"));
        profession.orElseThrow().print();
    }
}
