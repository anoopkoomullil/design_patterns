package patterns.behavioral.flyweight;

import patterns.behavioral.flyweight.Animal;
import patterns.behavioral.flyweight.CommonSharableClass;

public class Rat implements Animal {

    private String name = null;
    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void printAnimalAttributes() {
        System.out.println("The number of nose of Dog = " + CommonSharableClass.nose);
        System.out.println("The number of eyes of Dog = " + CommonSharableClass.eyes);
        System.out.println("The number of legs of Dog = " + CommonSharableClass.legs);
        System.out.println("The number of tail of Dog = " + CommonSharableClass.tail);
    }
}