import java.util.Scanner;
public class Conditionals {
    public static void main(String [] args) {

        //simulate flipping a coin and print the result of heads
        //or tails

        //random number - 1 or 2 - 1 is heads, 2 is tails
        int randomNumber = (int)(Math.random() * 2 + 1);

        //conditional statement (if-statement)
        //run code when a particular expression is true
        if (randomNumber == 1) {
            System.out.println("heads");
        }
        //the else clause runs when the preceding condition
        //is not true
        else {
            System.out.println("tails");
        }

        //the else clause is optional -
        //if you don't have one, there won't be a separate
        //branch of code to run when the if isn't true

        //any code outside of the if/else structure will run
        //no matter what

        //s is just a variable name - call it what you want
        Scanner s = new Scanner(System.in);

        System.out.println("enter 3 numbers");

        //user enters 3 ints, program outputs the largest one
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = 0;

        if(a > b && a > c) {
            max = a;
        }
        if(b > a && b > c) {
            max = b;
        }
        if(c > a && c > b) {
            max = c;
        }
        System.out.println("biggest is " + max);



        if(a > b && a > c) {
            max = a;
        }

        if(b > a && b > c) {
            max = b;
        }
        else {
            //the else is only dependent on the if immediately above it
            //that means regardless of whether a is the largest, max will then
            //get set depending on b > a && b > c
            max = c;
        }
        System.out.println("biggest is " + max);


        if(a > b && a > c) {
            max = a;
        }
        //else if lets you link multiple conditions and only the first one
        //that's true will trigger code to run
        //-any following else ifs or elses will not run after the first one is true
        else if(b > a && b > c) {
            max = b;
        }
        else {
            max = c;
        }
        System.out.println("biggest is " + max);

        //when the code to run inside an if/else if/else is only one line,
        //curly braces aren't necessary
        if (a > b && a > c)
            max = a;

        //this always runs - not inside if-statement bc no { }
        System.out.println("blah");

        //switching from numerical to text input - need an extra nextLine()
        s.nextLine();

        String realPW = "pelican";
        System.out.println("enter your password");
        String userPW = s.nextLine();

        //need to use .equals() for strings
        if (userPW.equals(realPW)) {
            System.out.println("wow good job you're so smart good for you!!!!");
        }
        //length of a string is how many characters are in it
        //since length is an int, use ==
        else if (userPW.length() == 0)
            System.out.println("you didn't type anything you dumdum");
        else if (userPW.length() == realPW.length())
            System.out.println("closer but still WRONG you dumdum");
        else
            System.out.println("you dumdum");

        System.out.println("enter a number between 10 and 20");
        //want to give feedback for too high, too low, in range
        int uNum = s.nextInt();

        //nested conditionals - if statements can go in other if statements

        if (uNum > 10) {

            //this will only run when the outer condition is true
            if (uNum < 20) {
                System.out.println("your number is in range");
            }
            else {
                System.out.println("greater than or equal to 20");
            }
        }
        //when the outer condition isn't true, run this:
        else {
            System.out.println("less than or equal to 10");
        }
    }
}
