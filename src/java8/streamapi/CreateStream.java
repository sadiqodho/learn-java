package java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * CreateStream class showing stream example of Java 8
 */
public class CreateStream {
    public static void main(String[] args) {
        String[] names = {"Muhammad", "Sadiq", "Ibrahim", "Sahil", "Riaz", "Fiaz"};
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        // Create based on array
        Stream<String> arrayStream = Arrays.stream(names);

        // Collection based
        Stream<String> collectionStream = nameList.stream();

        // using method
        Stream<Integer> generateMethod = Stream.generate(() -> 5);

        // Iterator Method
        Stream<Integer> iterateStream = Stream.iterate(1, x -> x + 2);

    }
}
