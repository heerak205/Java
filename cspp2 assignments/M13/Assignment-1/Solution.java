import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author :Heerak
 */
class Set {
    //your code goes here...
    //Good luck :-)
    //your code goes here...
    //Good luck :-)
    /**
     * {final int number}.
     */
    private final int num = 10;
    /**
     * {declaration of an array of type int}.
     */
    private int[] set;
    /**
     * {declaration of size of type int}.
     */
    private int size;
    /**
     * Constructs the object.
     */
    Set() {
        set = new int[num];
        size = 0;
    }
    /**
     * {method to add te given item}.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] == item) {
                count = count + 1;
            }
        } if (count == 0) {
            set[size++] = item;
        }

    }
    /**
     * {method to return size}.
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**
     * {method to have a dynamic size}.
     *
     * @return     { description_of_the_return_value }
     */
    public int[] resize() {
        int[] set2 = new int[size * 2];
        for (int i = 0; i < size; i++) {
            set2[i] = set[i];
        }
        return set2;
    }
    /**
     * {method to return boolean type
     * on wether the given item is present or not}.
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (set[i] == item) {
                return true;
            }
        }
        return false;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "{}";
        }

        String str = "{";
        for (int i = 0; i < size - 1; i++) {
            str += set[i] + "," + " ";
        }
        str += set[size - 1] + "}";
        return str;
    }
    /**
     * {method to add the items from the given array
     * and shouldnt be repeated}.
     *
     * @param      newArray  The new array
     */
    public void add(final int[] newArray) {
        int count = 0;
        for (int i = 0; i < newArray.length; i++) {
            count = 0;
            for (int j = 0; j < size; j++) {
                if (newArray[i] == set[j]) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                set[size++] = newArray[i];
                //System.out.println("hi");
            }
        }
    }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                /**
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                */
                default:
                break;
            }
        }
    }
}
