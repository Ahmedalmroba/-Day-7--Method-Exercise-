import java.util.Scanner;

public class Main {

         /*   1 - Write a Java method to find the smallest number among three numbers.
    Test Data:
    Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is 25.0
          */
         public static double findSmallestNumber(double num1, double num2, double num3) {
             double smallest = num1;

             if (num2 < smallest) {
                 smallest = num2;
             }

             if (num3 < smallest) {
                 smallest = num3;
             }

             return smallest;
         }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Input the second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Input the third number: ");
        double thirdNumber = input.nextDouble();

        double smallestNumber = findSmallestNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println("The smallest value is " + smallestNumber);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        checkNumber(number);



        System.out.print("Input the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Input the second number: ");
        int secondNum = input.nextInt();
        System.out.print("Input the third number: ");
        int thirdNum = input.nextInt();

        double smallestValue = Math.min(Math.min(firstNum, secondNum), thirdNum);
        System.out.println("The smallest value is " + smallestValue);

        input.nextLine(); // Consume the remaining newline character

        System.out.println("Enter a password:");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid password!");


        }}
/*2 - Write a Java method that check if the entered number is
negative or positive or zero.

 */

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");

        }
    }


/*3 - Write a Java method to check whether a string is a valid password.
    Password rules:
    A password must have at least ten characters.
    A password consists of only letters and digits.
    A password must contain at least two digits.
    Input the first number: 25
    Input the Second number: 37
    Input the third number: 29
    Expected Output:
    The smallest value is 25.0
    Expected Output:
            1. A password must have at least eight characters.
            2. A password consists of only letters and digits.
            3. A password must contain at least two digits
    Input a password (You are agreeing to the above Terms and Conditions.):
    abcd1234*/

    public static boolean isValidPassword(String password) {
        if (password.length() < 10) {
            System.out.println("1. A password must have at least ten characters.");
            return false;
        }


        if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("2. A password consists of only letters and digits.");
            return false;
        }

        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            System.out.println("3. A password must contain at least two digits.");
            return false;
        }

        return true;
    }
    }







