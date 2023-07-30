package java8.lambda;

/**
 * Toaster is an interface with abstract method
 */
@FunctionalInterface
interface Toaster {
    String toast(String string);
}

/**
 * ExpressionBody is a class for interacting with interfaces
 */
public class ExpressionBody {
    public static void main(String[] args) {

        // Return example
        Toaster toaster1 = (string) -> { return "<" + string + ">" ; };
        System.out.println(toaster1.toast("My Receipe"));

        // No body expression
        Toaster toaster2 = String::toLowerCase;
        System.out.println(toaster2.toast("Hello Dear"));

    }
}
