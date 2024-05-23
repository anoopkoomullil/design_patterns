package patterns.behavioral.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.getCat("CAT");
        cat.printAnimalAttributes();

        Animal cats = AnimalFactory.getCat("CAT");
        cats.printAnimalAttributes();

        Animal rat = AnimalFactory.getRat("RAT");
        rat.printAnimalAttributes();

        Animal cow = AnimalFactory.getCow("COW");
        cow.printAnimalAttributes();

        Animal dog = AnimalFactory.getDog("DOG");
        dog.printAnimalAttributes();

        System.out.println(cat.hashCode());
        System.out.println(cats.hashCode());
        System.out.println(rat.hashCode());
    }
}
