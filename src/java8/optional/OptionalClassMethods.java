package java8.optional;

import java.util.Optional;

/**
 * OptionalClassMethods is a class, which showing optional class methods
 */
public class OptionalClassMethods {
    public static void main(String[] args) {

        /*
         * ifPresent
         * check wheather null values return true or false
         */
        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1.isPresent());

        /*
         * orElse
         * if not, a default value is specified
         */
        String newString = optional1.orElse(new String("New String"));
        System.out.println(newString);

        /*
         * orElseGet
         * similar to orElseGet
         * Supplier will be used in the case of optional is empty
         */
        String newSupplier = optional1.orElseGet(()-> new String("New Supplier"));
        System.out.println(newSupplier);


        /*
         * orElseThrow
         * if there is not option present then throw exception
         */
        //optional1.orElseThrow(() -> new NullPointerException("No value found!"));

        /*
         * Filter with optional
         */
        System.out.println(
                optional1.filter( f -> f.contains("Odho")).orElse(new String("No Match Found!"))
        );

        /*
         * Map for changing individual element
         */
        Optional<Integer> number = Optional.of(45);
        System.out.println(number.map( m -> m * 2).get());
    }
}
