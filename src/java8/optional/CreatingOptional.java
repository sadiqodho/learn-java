package java8.optional;

import java.util.Optional;

/**
 * CreatingOptional is a class for showing example of java8 Optional class
 */
public class CreatingOptional {
    public static void main(String[] args) {
        // Create Empty optional
        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1.isPresent());

        // you are 100% sure there will be no null values then use of, otherwise it will raise exception
        Optional<String> optional2 = Optional.of(new String("Hello World!"));

        // if you are not sure then use ofNullable
        String name = null;
        Optional<String> optional3 = Optional.ofNullable(name);

    }
}
