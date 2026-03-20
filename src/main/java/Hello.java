/**
 * HelloApp.java - A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to greeting "World" if no name is
 * given. This use case demonstrates how to handle optional command-line arguments and
 * provide default values in Java.
 *
 * UC 3: Provide Default Value - The application should display a default greeting
 * if no name is provided as a command-line argument.
 *
 * Usage: java HelloApp [name]
 * - If a name is provided, it will display "Hello, [Name]!"
 * - If no name is provided, it will display "Hello, World!"
 *
 * @author Poojith
 * @version 3.0
 * @since UC3
 */

/**
 * Key Concepts:
 * 1. Default Values: Providing a fallback value when no input is given
 * 2. Command-line Arguments: Accessing user input via args[] parameter
 * 3. Conditional Statements: Using if to check conditions
 * 4. Boolean Logic: Using logical conditions to control flow
 * 5. Array Length: Checking the number of command-line arguments
 */

public class Hello{

    public static void main(String[] args) {

        String name = "World";
    
        if (args.length > 0) {
            name = args[0]; 
        }
        System.out.println("Hello, " + name + "!");
    }
}