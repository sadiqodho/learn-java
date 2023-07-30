package java8.streamapi;

import java.util.stream.Stream;

/**
 * ParallelStreams is for processing operations on streams in a parallel manner
 * It is good for large set of array
 */
public class ParallelStreams {
    public static void main(String[] args) {
        // With parallel
        int result = Stream.of(4, 6, 3, 8, 7, 2, 9, 7, 5, 2, 1).
                parallel().reduce(0, Integer::sum);
        System.out.println(result);

        // without parallel
        int result2 = Stream.of(4, 6, 3, 8, 7, 2, 9, 7, 5, 2, 1).
                reduce(0, Integer::sum);
        System.out.println(result2);
    }
}
