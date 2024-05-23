package shadowing;

import java.util.function.BiConsumer;

public class MainClass {
    
    public static void main(String[] args){
        Animal animal = new AquaticAnimal();
        animal.specialProperty();

        BiConsumer<Integer,Integer> biConsumer = (a,b)->System.out.println(a+b);
        biConsumer.accept(3,4);
    }
}
