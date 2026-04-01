/**
 * UC7: Display "Hello" with Multiple Command-Line Arguments 
 * using String.join() Method or Default Message
 *
 * Description:
 * This application accepts zero or more command-line arguments 
 * and prints a greeting message.
 * - If arguments are provided → joins them using String.join()
 *   and displays: "Hello, Name1, Name2, ..."
 * - If no arguments are provided → displays: "Hello, World!"
 *
 * Usage:
 *   java HelloApp [name1] [name2] ... [nameN]
 *
 *
 * @author Poojith
 * @version 7.0
 */

public class Displayname {

    public static void main(String[] args) {

        String names;

        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }

          System.out.println("Hello, " + names + "!");
 }
}  

