package consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args){
        ConsumerDemo demo = new ConsumerDemo();
        System.out.println(demo.multiply(5));

        Consumer<Integer> consumer = integer -> System.out.println(integer*integer);
        consumer.accept(9);
        Consumer<Integer> consumer1 = integer -> System.out.println(integer*2);
        consumer.andThen(consumer1).accept(9);

    }

    private Integer multiply(int i) {
        return i * i;
    }
}
