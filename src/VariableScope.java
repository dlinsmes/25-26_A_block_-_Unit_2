import java.util.Scanner;

public class VariableScope {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        //warm up
        //prompt for two numbers
        System.out.println("enter a number");
        int num1 = s.nextInt();
        System.out.println("enter anoter number");
        int num2 = s.nextInt();

        //prompt for a word
        s.nextLine();
        System.out.println("enter a word");
        String word = s.nextLine();

        //declare smallest and biggest here instead of inside
        //the if statement checking num1 < num2
        int smallest = num2;
        int biggest = num1;

        if (num1 < num2) {
            smallest = num1;
            biggest = num2;
        }

        //declare r before any of the if statements
        int r = 0;

        //-if the word size is smaller than the smaller num,
        if (word.length() < smallest) {
            // generate an even number 2-10

            //generate [1,5] then multiply by 2
            r = (int)(Math.random() * 5 + 1) * 2;
        }
        //-if the word size is bigger than the bigger num,
        if (word.length() > biggest) {
            // generate an odd number 1-9

            // generate even nums [0,8], then add 1
            r = (int)(Math.random() * 5) * 2 + 1;
        }
        //-if the word size is between (inclusive) the two nums,

        if (word.length() >= smallest && word.length() <= biggest) {
            // generate a negative num
            r = -(int)(Math.random() * 10);
        }
        //print the generated num
        System.out.println(r);

        //variable scope - a variable is only accessible in the
        //location where it's declared

        //since b is declared in main(), it can be accessed
        //anywhere after the declaration in main(), including
        //in the if/else statements
        int b = 20;

        if (num1 < 10) {
            //since a is declared in this if-statement, it doesn't
            //exist outside of the if statement
            int a =  8;
            System.out.println(a);
            System.out.println(b);

            int c = 30;
        }
        else {
            //also doesn't exist in the else
            //System.out.println(a);
            System.out.println(b);

            //this is valid bc the else does not see the
            //c variable in the if-statement
            //-this is different from the c in if
            int c = 40;

        }

        //a does not exist outside of the above if statement
        //System.out.println(a);
        System.out.println(b);


    }
}
