/**
 * {imports all the utilities}.
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /*Write the atrributes and methods for InputValidator*/
    private String input;
    /**
     * Constructs the object.
     *
     * @param      input  The input
     */
    InputValidator(final String input) {
        this.input = input;
    }
     private static final int SIX = 6;
    /**
     * {function of return type boolean}.
     *
     * @return     { description_of_the_return_value }
     */
    public boolean validateData() {
        int size = this.input.length();
        if (size >= SIX) {
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
     * Constructs the object.
     */
    private Solution(){        
    }
    /**
     * {main function}.
     * @param args
     */
    public static void main(final String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
