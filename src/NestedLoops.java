import java.util.Scanner;
public class NestedLoops {
    public static void main(String [] args) {
    /*
    wu
    -with a loop, prompt the user for 5 numbers
    -output the biggest and smallest user numbers
     */
        Scanner s = new Scanner(System.in);
        //when looking for a max (biggest) value,
        //make the initial value something small
        //so that any input number should be bigger than
        //that initial value

        //Integer min value and max value variables hold
        //the smallest and biggest possible values that
        //the integer data type can hold

        int biggest = Integer.MIN_VALUE;

        //opposite for smallest - start with a large value
        //that all other numbers should be smaller than
        int smallest = Integer.MAX_VALUE;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("give me number");
//            int num = s.nextInt();
//
//            //biggest will hold the current largest value
//            //and will update when num is larger than the
//            //old biggest value
//            if (num > biggest)
//                biggest = num;
//            if (num < smallest)
//                smallest = num;
//        }
//        System.out.println("biggest is " + biggest);
//        System.out.println("smallest is " + smallest);


        //-don't need to memorize these values
        //but know that the int data type is constrained
        //to numbers between these two values
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);

        //if you try to go beyond the range of allowed values,
        //the value wraps around to the opposite end
        System.out.println("min value - 1: " + (Integer.MIN_VALUE - 1)); //results in max value

        System.out.println("max value + 1: " + (Integer.MAX_VALUE + 1)); //results in max value



        //nested loops
        //loops can go in other loops

        int count = 0;
        //outer loop runs 5 times
        for (int i = 0; i < 5; i++) {

            //use a different variable for the inner loop
            //this inner loop runs 10 times
            for (int j = 0; j < 10; j++) {
                count++;
                System.out.println(count + " - potato, i is " + i + ", j is " + j);

            }
            //every iteration of the i loop will run
            //the full j loop from j = 0 through j < 10
        }

        System.out.println();

        //nested loops can print 2d grids/designs

        //outer loop controls how many horizontal rows
        for (int i = 0; i < 4; i++) {

            //inner loop is controlling each element of a row
            for (int j = 0; j < 8; j++) {
                System.out.print("x");
            }
            //output a line break between horizontal rows
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            //the length of each row depends on the current i value
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //decrease each row's length as the outer loop runs
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println();

        //goal: get a resulting shape the same as the previous
        //but with an incrementing outer loop
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("x");
            }
            System.out.println();
        }

    }

}
