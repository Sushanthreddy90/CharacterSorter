import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> input = Arrays.asList('a', 'b', 'c', 'c', 'b', 'b', 'a');
        List<Character> sorted = GenericSorter.sortInput(input);
        System.out.println(sorted);
    }
}
