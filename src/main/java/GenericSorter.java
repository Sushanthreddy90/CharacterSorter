import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericSorter<T> {
  public static <T> List<T> sortInput(List<T> input) throws IllegalArgumentException {
    if (input == null || input.isEmpty()) {
      throw new IllegalArgumentException("Input list cannot be null or empty.");
    }

    Map<T, Integer> elementCountMap = new HashMap<>();
    for(T element : input) {
      int count = elementCountMap.getOrDefault(element, 0);
      elementCountMap.put(element, count +1);
    }
    List<T> result = new ArrayList<>(elementCountMap.keySet());
    result.sort((elem1, elem2) -> {
        int count1 = elementCountMap.get(elem1);
        int count2 = elementCountMap.get(elem2);
        return count2 - count1;
    });
    return result;
  }
}
