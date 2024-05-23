package patterns.creational.factory;

import java.util.Optional;

public class FactoryMain {
    public static void main(String[] args) {
        Optional<Profession> profession = Optional.ofNullable(ProfessionFactory.getProfession("Engineer"));
        profession.orElseThrow().print();
    }
}
