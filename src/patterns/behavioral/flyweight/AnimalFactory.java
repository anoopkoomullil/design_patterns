package patterns.behavioral.flyweight;

import java.util.HashMap;

public class AnimalFactory {
    private static HashMap<String,Animal> animalMap = new HashMap<>();

    public static Animal getCat(String name){
        String key = name + "-CAT";
        Animal animal = animalMap.get(key);
        if(animal!=null){
            return animal;
        }else{
            animal = new Cat();
            animal.setName(name);
            animalMap.put(key,animal);
        }
        return animal;
    }
    public static Animal getDog(String name){
        String key = name + "-DOG";
        Animal animal = animalMap.get(key);
        if(animal!=null){
            return animal;
        }else{
            animal = new Dog();
            animal.setName(name);
            animalMap.put(key,animal);
        }
        return animal;
    }
    public static Animal getCow(String name){
        String key = name + "-COW";
        Animal animal = animalMap.get(key);
        if(animal!=null){
            return animal;
        }else{
            animal = new Cow();
            animal.setName(name);
            animalMap.put(key,animal);
        }
        return animal;
    }
    public static Animal getRat(String name){
        String key = name + "-RAT";
        Animal animal = animalMap.get(key);
        if(animal!=null){
            return animal;
        }else{
            animal = new Rat();
            animal.setName(name);
            animalMap.put(key,animal);
        }
        return animal;
    }
}
