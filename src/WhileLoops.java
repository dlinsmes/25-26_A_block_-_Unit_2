import java.util.Scanner;
public class WhileLoops {

    public static void main(String [] args) {
    /*
    Generate random [1,10]
    -when even set word to apple
    -when odd set word to potato
    -when more than 5 add s to end of word
    -when more than 8 add "many " to front of word
    print number and word
     */
        int r = (int)(Math.random() * 10 + 1);
        String word;
        if (r % 2 == 0)
            word = "apple";
        else
            word = "potato";
        if (r > 5)
            word = word + "s";
        if (r > 8)
            word = "many " + word;
        System.out.println(r + " " + word);

        //loops let us repeat code to run

        //while loops are like repeating if-statements
        //-they check the condition to determine whether the code runs
        //-after every iteration (turn of the loop), the condition
        //gets checked again

        int x = 0;

        while (x < 5) {
            System.out.println(x);

            //adds 1 to x
            x++;
        }
        //the last number printed is 4, bc even though x does
        //increment to 5, at that point the condition is no longer
        //true so the loop doesn't run again
        System.out.println("outside loop x is " + x);

        x = 0;
        while (x < 5) {
            x++;
            //even though x becomes 5 in the middle of the loop
            //iteration, the condition won't be checked again until AFTER
            //the code inside the loop completes

            System.out.println(x);
        }
        //this changes the values printed bc we add first before printing

        x = 0;
//        while (x < 5)
//            System.out.println(x);
        //infinite loops are bad
        //-the termination is never met and the condition is always true
        //so the code inside keeps running forever
        //-any code after the infinite loop would never get reached

        System.out.println("hi");

        //typically use while loops when you can't determine how many
        //times it needs to iterate

        //count how many times we need to generate a random number [1,50]
        //until we get 38

        int count = 0;
        int random = 0;
        while (random != 38) {
            count++;
            random = (int)(Math.random() * 50 + 1);
        }
        //to get only the final count, print outside
        System.out.println("it took "  + count + " tries to generate 38");

        //this problem needs a while loop bc we don't know how many times
        //it needs to run before the condition is met

        //want the user to enter the numbers 1, 2, or 3 to keep going
        //or any other number to stop
        Scanner s = new Scanner(System.in);
        System.out.println("enter 1, 2, or 3 to keep going or any other number to stop");
        int num = s.nextInt();
        while (num == 1 || num == 2 || num == 3) {
            System.out.println("enter 1, 2, or 3 to keep going or any other number to stop");
            //important - need to add code that would potentially
            //allow the loop to stop
            //-update the value of num
            num = s.nextInt();
        }
        System.out.println("next loop");

        //don't do this: while(true) and break will get deductions
        System.out.println("enter 1, 2, or 3 to keep going or any other number to stop");
        num = s.nextInt();
        while(true) {
            if (num == 1 || num == 2 || num == 3) {
                System.out.println("enter 1, 2, or 3 to keep going or any other number to stop");
                num = s.nextInt();
            }
            else {
                break; //get out of the
            }
        }
    }


}
