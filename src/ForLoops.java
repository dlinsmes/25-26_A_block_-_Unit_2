import java.util.Scanner;
public class ForLoops {
    public static void main(String [] args) {
    /*
    warm up
    ask the user for numbers until they put in zero
    then print the sum of their numbers
     */
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int userNum = 1;
        while (userNum != 0) {
            System.out.println("enter a number or 0 to stop");
            userNum = s.nextInt();
            sum += userNum;
        }
        System.out.println("the sum of your numbers is " + sum);

        //while loops are condition-based: they run as long as the condition
        //is true
        //for loops are iteration-based: we know ahead of time how many times
        //the loop will iterate (run)

        //parts of a for loop
        //initialization - int i = 0 - declare an int variable with a value
        //condition - i < 10 - the loop continues to run as long as this is true
        //advancement/increment - i++ - every time an iteration of the loop finishes,
        //this changes the i value so that it gets closer to the termination condition
        for(int i = 0; i < 10; i++) {
            //print() will output on the same line
            System.out.print(i + " ");
            //last number printed is 9 bc when i becomes 10, the condition
            //is no longer true
        }

        //the i variable only exists within the scope of the loop
        //System.out.println(i);

        //bc of that, multiple for loops can all use i as the variable name
        System.out.println();

        //the advancement step can add or subtract different values
        for (int i = 0; i < 10; i+= 2)
            System.out.print(i + " ");


        System.out.println();

        //count down from 20 to 15
        //-can decrement for the advancement step to count down
        for (int i = 20; i > 14; i--)
            System.out.print(i + " ");

        System.out.println();

        //for loops can always be written as while loops
        int silly = 20;         //initialization
        while (silly > 14) {    //condition
            System.out.print(silly + " ");
            silly--;            //advancement
        }

        System.out.println();

        //can't always easily convert while loops to for loops
        //ex - the warmup problem doesn't have a predetermined number
        //of times to run

        //ask the user for two numbers
        //calculate and output the sum of all numbers between the two inputs
        sum = 0;
        System.out.println("enter a number");
        int firstNum = s.nextInt();
        System.out.println("enter a bigger number");
        int secondNum = s.nextInt();
        for (int i = firstNum; i <= secondNum; i++)
            sum += i;
        System.out.println("sum of numbers between " + firstNum + " and " +
                secondNum + " is " + sum);

        //ask the user for a number
        //determine whether or not the number is prime
        //-a prime number is only divisible by itself and 1
        System.out.println("give me a prime number");
        int uNum = s.nextInt();

        boolean isPrime = true;
        //test divisibility by numbers 2 - (num-1)
        //if uNum is divisible by any of those numbers, it's not prime
        for (int i = 2; i < uNum; i++) {
            if (uNum % i == 0) {
                //uNum is divisible by something
                //not prime
                isPrime = false;
            }
            //no else to set isPrime back to true
            //bc once a number is proven to be not prime, that status
            //can't be changed
        }

        //same as saying isPrime == true
        if (isPrime)
            System.out.println("number is prime");
        else
            System.out.println("not prime");


    }
}
