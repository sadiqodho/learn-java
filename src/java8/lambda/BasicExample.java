package java8.lambda;

/**
 * Calculator is an interface for add operation
 */
@FunctionalInterface
interface Calculator{
    double add(double a, double b);
}

/**
 * Screen is an interface with display method
 */
@FunctionalInterface
interface Screen{
    void display();
}

/**
 * Car is an interface with drive method
 */
@FunctionalInterface
interface Car{
    void drive(String str);
}

/**
 * BasicExample is a class for manipulating with interfaces
 */
public class BasicExample {
    public static void main(String[] args) {

        Calculator calculator1 = Double::sum;
        Calculator calculator2 = (a, b) -> a + b;
        Calculator calculator3 = (a, b) -> { return a + b; };
        System.out.println(calculator1.add(5d, 4d));

        Screen screen1 = () -> System.out.println("Hello World!");
        screen1.display();

        Car car1 = (str)-> { System.out.println(str);};
        Car car2 =  str -> {System.out.println(str);};
        Car car3 = System.out::println;
        car3.drive("Driving me!");
    }
}
