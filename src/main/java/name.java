/**
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop
 *
 * Description:
 * The application accepts multiple names as command-line arguments and displays
 * a personalized greeting for each user using an enhanced for loop.
 * If no names are provided, it displays "Hello, World!".
 *
 * Usage:
 * java HelloApp [name1] [name2] ... [nameN]
 *
 * Example:
 * Input:  java HelloApp John Alice Bob
 * Output: Hello, John, Alice, Bob!
 *
 * Input:  java HelloApp
 * Output: Hello, World
 *
 * Features:
 * - Accepts multiple inputs via command-line arguments
 * - Uses enhanced for loop for iteration
 * - Uses StringBuilder for efficient string concatenation
 * - Handles default case when no input is provided
 * - Formats output with comma-separated names
 *
 * @author Poojith
 * @version 1.0
 * @since UC5
 */

public class name {
     public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}
