/**
 * {imports all the utilities}.
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /*Write the atrributes and methods for InputValidator*/
    /**
     * {instance variable}.
     */
    private String input;
    /**
     * Constructs the object.
     *
     * @param      str   The string
     */
    InputValidator(final String str) {
        this.input = str;
    }
    /**
     * {constant declaration}.
     */
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
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * {main function}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
