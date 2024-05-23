package function;

import java.util.function.Function;

public class FunctionDemo {
    public  static void main(String args[]){
    FunctionDemo demo = new FunctionDemo();
        System.out.println(demo.squre(8));

        Function<Integer,Integer> func = f -> f*f;
        System.out.println(func.apply(5));

        Function<Integer,Integer> func1 = f -> f*2;
        Function<Integer,Integer> func2 = f -> f*f*f;

        System.out.println(func1.andThen(func2).apply(5));
        System.out.println(func1.compose(func2).apply(5));

    }

    private int squre(int i) {
        return i*i;
    }
}
