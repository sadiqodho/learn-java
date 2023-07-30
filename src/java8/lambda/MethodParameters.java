package java8.lambda;

/**
 * Fan is an interface with abstract method
 */
@FunctionalInterface
interface Fan{
    boolean isRunning(String str);
}

/**
 * MethodParameters is a class which contains a method with parameterized lambda syntax
 */
public class MethodParameters {
    public static void main(String[] args) {
        System.out.println(
                display(
                        str -> str.contains("Yes"),
                        "Yes"
                )
        );
    }

     static boolean display(Fan f, String state){
        return f.isRunning(state);
    }
}