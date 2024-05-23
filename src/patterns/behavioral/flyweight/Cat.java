package patterns.behavioral.flyweight;

public class Cat implements Animal{

    private String name = null;
    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void printAnimalAttributes() {
        System.out.println("The number of nose of Cat = " + CommonSharableClass.nose);
        System.out.println("The number of eyes of Cat = " + CommonSharableClass.eyes);
        System.out.println("The number of legs of Cat = " + CommonSharableClass.legs);
        System.out.println("The number of tail of Cat = " + CommonSharableClass.tail);
    }
}
