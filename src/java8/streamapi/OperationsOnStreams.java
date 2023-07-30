package java8.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * OperationsOnStreams class is for methods of stream class
 */
public class OperationsOnStreams {
    public static void main(String[] args) {
        String[] names = {"Muhammad", "Sadiq", "Ibrahim", "Sahil", "Riaz", "Fiaz"};

        /*
         * Filter
         * returns new stream without match of the elements
         */
        Arrays.stream(names).filter(s -> s.startsWith("S")).forEach(System.out::println);

        /*
         * Map
         * return new stream with all elements changed using the provided function
         */
        Arrays.stream(names).map( s -> s.concat(" - student")).forEach(System.out::println);

        /*
         * flatMap
         * return stream with elements of all collections on stream as a separate element on the stream,
         * removing the collection layers
         */
        String[][] array2D = {
                names,
                names
        };

        // both ways
        String[] arr1D1 = Stream.of(array2D).flatMap(s -> Stream.of(s)).toArray(size -> new String[size]);
        String[] arr1D2 = Arrays.stream(array2D).flatMap(Arrays::stream).toArray(String[]::new);
        Stream.of(arr1D2).forEach(System.out::println);

        /*
         * Peek
         * Return a stream with all the elements on the steram. The specified action
         * will be executed for all elements
         */
        String[] arr1D3 = Arrays.stream(array2D).flatMap(Arrays::stream)
                .peek(s-> System.out.println("Peek - " + s))
                .toArray(String[]::new);

        /*
         * Limit
         * returns a stream with specified number of elements
         */
        String[] limitedNames = Stream.of(names).limit(2).toArray(String[]::new);
        Stream.of(limitedNames).forEach(System.out::println);
        System.out.println();

        /*
         * Skip
         * returns a stream with specified number of elements skipped
         */
        String[] skipped = Stream.of(names).skip(2).toArray(String[]::new);
        Stream.of(skipped).forEach(System.out::println);

        /*
         * distinct
         * return a stream with only unique values
         */
        System.out.println();
        String[] uniqueValues = Stream.of(arr1D1).distinct().toArray(String[]::new);
        Stream.of(uniqueValues).forEach(System.out::println);

        /*
         * Sorted (Natural order) or specified comparator
         */
        String[] sorted1 = Stream.of(names).sorted().toArray(String[]::new);
        Stream.of(sorted1).forEach(System.out::println);
    }
}
