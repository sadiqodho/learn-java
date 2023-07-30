package java8.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TerminalOperations is for making different operations of stream
 */
public class TerminalOperations {
    public static void main(String[] args) {
        String[] names = {"Muhammad", "Sadiq", "Ibrahim", "Sahil", "Riaz", "Fiaz"};
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        /*
         * For Each
         * */
        Arrays.stream(names).forEach(System.out::println);
        Arrays.stream(names, 1, 4).forEach(System.out::println);

        /*
         * Minimum finding
         */
        Optional<String> minResult =  Arrays.stream(names).min((a, b) -> a.compareTo(b));
        System.out.println(minResult);

        // Generate infinite series of integers between 100 to 0
        Stream<Integer> generated = Stream.generate(() -> new Random().nextInt(100));
        //generated.forEach(System.out::println);

        /*
         * All match
         */
        Boolean matched = nameList.stream().allMatch(s -> !s.isEmpty());
        System.out.println("Is matched: " + matched);

        /*
         * Any Match
         */
        Boolean anyMatch = nameList.stream().anyMatch(s -> s.contains("Sadiq"));
        System.out.println("Any match: " + anyMatch);

        /*
         * None match
         */
        Boolean noneMatch = nameList.stream().noneMatch(s -> s.isEmpty());
        System.out.println("None match: " + noneMatch);

        /*
         * Collect
         */

        // Merge the names into one string with comma delimeter
        String joinedString = nameList.stream().filter(s -> s.length() > 5).collect(Collectors.joining(","));
        System.out.println(joinedString);

        List<String> longNames = nameList.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
        System.out.println(longNames);

        /*
         * reduce
         * one end result
         */
        int[] numbers = {4, 6, 3, 8, 7, 2, 9, 7, 5, 2, 1};
        Integer sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

    }
}
