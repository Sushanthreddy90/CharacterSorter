import org.junit.*;
import java.util.*;

public class CharacterSorterTest {
  @Test
  public void testSortCharacters() {
    List<Character> result = CharacterSorter.sortCharacters("Apple");
    List<Character> expected = Arrays.asList('p', 'a', 'l', 'e');
    Assert.assertEquals(expected, result);
  }
  
  @Test
  public void testSortCharactersWithEmptyString() {
    List<Character> result = CharacterSorter.sortCharacters("");
    List<Character> expected = new ArrayList<>();
    Assert.assertEquals(expected, result);
  }
  
  @Test
  public void testSortCharactersWithDuplicateCharacters() {
    List<Character> result = CharacterSorter.sortCharacters("banana");
    List<Character> expected = Arrays.asList('a', 'n', 'b');
    Assert.assertEquals(expected, result);
  }
}
