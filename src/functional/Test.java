package functional;

public class Test {
    public static void main(String[] args){

        FunctionalInterfaceDemo fdemo = Tests::methodRef;
        fdemo.functIntMethod();
        FunctionalInterfaceDemo fdemo1 = ()->System.out.println("Inside test method");;
        fdemo1.functIntMethod();
        FunctionalInterfaceDemo.nextMethod();

    }
    class Tests{
        public static void methodRef(){
            System.out.println("Inside test method");
        }
    }
}
