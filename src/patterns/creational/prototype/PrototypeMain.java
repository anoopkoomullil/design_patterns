package patterns.creational.prototype;

import java.util.Optional;

public class PrototypeMain {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();
        Optional<Profession> profession = Optional.ofNullable(ProfessionCache.getClonedProgession(1));
        profession.orElseThrow().print();
        System.out.println(profession.get());
        Optional<Profession> profession1 = Optional.ofNullable(ProfessionCache.getClonedProgession(1));
        profession1.orElseThrow().print();
        System.out.println(profession1.get());
    }
}
