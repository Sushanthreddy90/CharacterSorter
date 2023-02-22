import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringSorterTest {

  @Test
  public void testSortStrings_Positive() {
    List<String> input = Arrays.asList("apple", "banana", "cherry", "cherry", "banana", "banana", "apple", "date");
    List<String> expected = Arrays.asList("banana", "apple", "cherry", "date");
    List<String> actual = GenericSorter.sortInput(input);
    assertEquals(expected, actual);
  }

  @Test
  public void testSortStrings_EmptyInput() {
    List<String> input = Collections.emptyList();
    try {
      GenericSorter.sortInput(input);
      fail("Expected IllegalArgumentException was not thrown.");
    } catch (IllegalArgumentException e) {
      assertEquals("Input list cannot be null or empty.", e.getMessage());
    }
  }

  @Test
  public void testSortStrings_NullInput() {
    List<String> input = null;
    try {
      GenericSorter.sortInput(input);
      fail("Expected IllegalArgumentException was not thrown.");
    } catch (IllegalArgumentException e) {
      assertEquals("Input list cannot be null or empty.", e.getMessage());
    }
  }

  @Test
  public void testSortStrings_AllSameElement() {
    List<String> input = Arrays.asList("apple", "apple", "apple", "apple", "apple");
    List<String> expected = Arrays.asList("apple");
    List<String> actual = GenericSorter.sortInput(input);
    assertEquals(expected, actual);
  }

}
