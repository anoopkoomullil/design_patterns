package supplieer;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        System.out.println(SupplierDemo.getDate());
        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
    }
    private static Date getDate() {
        return new Date();
    }
}
