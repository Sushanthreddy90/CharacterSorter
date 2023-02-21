import java.util.*;

public class CharacterSorter {
  public static List<Character> sortCharacters(String input) {
    Map<Character, Integer> charCountMap = new HashMap<>();
    for (char c : input.toCharArray()) {
      int count = charCountMap.getOrDefault(c, 0);
      charCountMap.put(c, count + 1);
    }
    
    List<Character> result = new ArrayList<>(charCountMap.keySet());
    Collections.sort(result, (c1, c2) -> charCountMap.get(c2) - charCountMap.get(c1));
    return result;
  }
}
