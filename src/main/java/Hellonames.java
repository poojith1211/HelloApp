/**
 * UC 6: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop
 *
 * Description:
 * The application accepts multiple names as command-line arguments and displays
 * a personalized greeting for each user using an enhanced for loop.
 * If no names are provided, it displays "Hello, World!".
 *
 * Usage:
 * java HelloApp [name1] [name2] ... [nameN]
 *
 *
 * @author Poojith
 * @version 1.0
 * @since UC6
 */

public class Hellonames {
    public static void main(String[] args) {
         if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}
