package predicate;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args){
        PredicateFunctionDemo demo = new PredicateFunctionDemo();
        System.out.println(demo.checkLength("fjdgsf"));

        Predicate<String> predicate = s -> s.length() > 5;
        Predicate<String> predicateEven = s -> s.length()%2==0;
        System.out.println(predicateEven.and(predicate).test("jhsbcjhss"));
        System.out.println(predicateEven.or(predicate).test("jhsbcjhss"));
        System.out.println(predicateEven.negate().test("jhsbcjhs"));
    }

    public  boolean checkLength(String str){
        if(str!=null && str.length()>5){
            return  true;
        }
        return false;
    }
}
