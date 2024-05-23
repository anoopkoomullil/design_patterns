package BiPreFunCom;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {
    public static void main(String[] args){
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> a + b > 5;
        System.out.println(biPredicate.test(3,5));


        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a + b;
        System.out.println(biFunction.apply(3,5));

        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+" and "+b);
        biConsumer.accept(3,5);
    }
}
