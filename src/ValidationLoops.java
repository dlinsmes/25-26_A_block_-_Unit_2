import java.util.Scanner;
public class ValidationLoops {
    /*
    An apple costs $5, a banana costs $10
    -ask the user whether they want an apple or banana
    -if they input the wrong item, continue asking them
    until they put in something correct
    -after a valid input is received, print the cost of the item
     */
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("apple or banana?");
        String choice = s.nextLine();
        //loop when the input is invalid
        // boolean valid = choice.equals("apple") || choice.equals("banana")
        //invalid: !( choice.equals("apple") || choice.equals("banana") )
        // !choice.equals("apple") && !choice.equals("banana")
        while ( !( choice.equals("apple") || choice.equals("banana") ) ) {
            //prompt for a new input - error message optional
            System.out.println("invalid you dummy");
            System.out.println("apple or banana?");

            //important - get a new input
            choice = s.nextLine();
        }

        //at this point in the program, choice is guaranteed to be apple or banana
        if (choice.equals("apple"))
            System.out.println("$5 per apple");
        else //this works bc we know choice is one or the other
            System.out.println("$10 per banana");

        //prompt for a quantity that they want between 1 and 10, validate it,
        //then print the total price for that quantity of their selected fruit
        System.out.println("how many do you want? Enter a number between 1 and 10");
        int num = s.nextInt();
        // same as:
        //num <= 0 || num >= 11
        //! ( num >= 1 && num <= 10 )
        while( !(num > 0) || !(num < 11) ) {
            System.out.println("invalid number");
            System.out.println("how many do you want? Enter a number between 1 and 10");
            num = s.nextInt();
        }
        if (choice.equals("apple"))
            System.out.println(num + " apples costs $" + 5*num);
        else
            System.out.println(num + " bananas costs $" + 10*num);

    }
}
