import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for set.
 */

/**
 * Class for sorted set.
 */
class SortedSet extends Set {
  /**
   * Adds all.
   *
   * @param      items  The items
   */
  public void addAll(final int[] items) {
    for (int a : items) {
      add(a);
    }
    set = Arrays.copyOf(set, size);
    Arrays.sort(set);
  }
  /**
   * subSet function.
   *
   * @param      fromElement  The from element
   * @param      toElement    To element
   *
   * @return     { description_of_the_return_value }
   */
  public SortedSet subSet(final int fromElement, final int toElement) {
    SortedSet subset = new SortedSet();
    for (int i = 0; i < size; i++) {
      if (get(i) >= fromElement && get(i) < toElement) {
        subset.add(get(i));
      }
    }
    return subset;
  }
  /**
   * headSet Function.
   *
   * @param      toElement  To element
   *
   * @return     { description_of_the_return_value }
   */
  public SortedSet headSet(final int toElement) {
    SortedSet headset = new SortedSet();
    for (int i = 0; i < size; i++) {
      if (set[i] < toElement) {
        headset.add(get(i));
      }
    }
    return headset;
  }
  /**
   * Returns the last element of set.
   *
   * @return     { description_of_the_return_value }
   */
  public int last() {
    if (size != 0) {
      return set[size - 1];
    }
    System.out.println("Set Empty Exception");
    return -1;
  }
}
/**
 * Class for solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
    /**
     * Unused.
     */
  }
  /**
   * Int array splits by comma.
   *
   * @param      s     { parameter_description }
   *
   * @return     { description_of_the_return_value }
   */
  public static int[] intArray(final String s) {
    String input = s;
    return Arrays.stream(input.split(",")).mapToInt(
             Integer::parseInt).toArray();
  }
  /**
   * Main Function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    SortedSet s = new SortedSet();
    Scanner stdin = new Scanner(new BufferedInputStream(System.in));
    while (stdin.hasNext()) {
      String line = stdin.nextLine();
      String[] tokens = line.split(" ");
      switch (tokens[0]) {
      case "print":
        System.out.println(s);
        break;
      case "addAll":
        int[] intArray = intArray(tokens[1]);
        s.addAll(intArray);
        break;
      case "subSet":
        String[] arrstring = tokens[1].split(",");
        if (Integer.parseInt(arrstring[0]) > Integer.parseInt(
              arrstring[1])) {
          System.out.println("Invalid Arguments to Subset Exception");
        } else {
          // s = new SortedSet();
          System.out.println(s.subSet(Integer.parseInt(
          arrstring[0]), Integer.parseInt(arrstring[1])));
        }
        break;
      case "headSet":
        // s = new SortedSet();
        System.out.println(s.headSet(Integer.parseInt(tokens[1])));
        break;
      case "last":
        System.out.println(s.last());
        break;
      default:
        break;
      }
    }
  }
}
