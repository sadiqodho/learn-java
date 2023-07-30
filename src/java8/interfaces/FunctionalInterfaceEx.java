package java8.interfaces;

/**
 * FunctionalInterfaceEx implements interface
 */
public class FunctionalInterfaceEx implements FunctionalInterface{
    public static void main(String[] args) {

    }

    @Override
    public void wash() {

    }
}

/**
 * FunctionalInterface is an interface for having abstract method
 */
@java.lang.FunctionalInterface
interface FunctionalInterface{
    default void display(){
        System.out.println("Display 1");
    }
    void wash();
}
