package patterns.creational.builder;

import java.util.Optional;

public class BuilderMain {

    public static void main(String[] args) {
        EarthQuakeResistant earth = new EarthQuakeResistant();
        Director director = new Director(earth);
        director.buildComplexHome();
        Optional<Home> home = Optional.ofNullable(director.getComplexHome());
        System.out.println(home.orElseThrow());

        FloodRessistant flood = new FloodRessistant();
        Director floodDir = new Director(flood);
        floodDir.buildComplexHome();
        Optional<Home> fhome = Optional.ofNullable(floodDir.getComplexHome());
        System.out.println(fhome.orElseThrow());
    }

}
