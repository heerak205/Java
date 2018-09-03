/**
 * {imports all the utilities}.
 */
import java.util.*;
/**
 * Class for input validator.
 */
class InputValidator {
    /*Write the atrributes and methods for InputValidator*/
    String input;
    /**
     * Constructs the object.
     *
     * @param      input  The input
     */
    InputValidator(String input) {
        this.input = input;
    }
    /**
     * {function of return type boolean}.
     *
     * @return     { description_of_the_return_value }
     */
    public boolean validateData() {
        int size = this.input.length();
        if (size >= 6) {
            return true;
        }
        return false;
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * {main function}.
     */
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
