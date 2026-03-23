/**
 * HelloApp - UC4 - A simple Java application that greets multiple users by name
 * using command-line arguments. If no names are provided, it defaults to "World".
 *
 * Description:
 * This program accepts multiple names as command-line arguments and prints
 * a personalized greeting message. If no arguments are passed, it prints
 * a default greeting.
 *
 * Features:
 * 1. Accepts multiple names through command-line arguments.
 * 2. Displays a greeting message for all provided names.
 * 3. Uses "World" as a default value if no input is given.
 *
 * Usage:
 * java HelloApp [name1] [name2] ... [nameN]
 *
 * Example:
 * Input:  java HelloApp Alice Bob Charlie
 * Output: Hello, Alice, Bob, Charlie!
 *
 * Input:  java HelloApp John
 * Output: Hello, John!
 *
 * Input:  java HelloApp
 * Output: Hello, World!
 *
 * Key Concepts:
 * 1. Default Values – Used when no arguments are provided.
 * 2. Command-Line Arguments – Accessed using args[].
 * 3. Conditional Statements – Used to check input.
 * 4. Looping – Iterates through all arguments.
 * 5. StringBuilder – Efficient string concatenation.
 *
 * @author Poojith
 * @version 1.0
 * @since UC4
 */

public class Helloname {
    
     public static void main(String[] args) {

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            String name = nameBuilder.toString(); 
            System.out.println("Hello, " + name + "!");

        } else {
            System.out.println("Hello, World!");
        }
    }
}
