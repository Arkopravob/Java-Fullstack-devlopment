package variable_datatype_demo;
/**
 * This program performs some mathematical computations and displays
 * the results. It then reports the number of seconds that the
 * computer spent on this task.
 */
public class TimedComputation {
    public static void main(String[] args) {
        long startTime; //starting program with milisecends.
        long endTime; // when prgramming done with miliseconds.

        double time; // time difference
        startTime = System.currentTimeMillis();
        double height, width, hypotenouse ; // of tringle
        width = 42.0;
        height = 17.0;
        hypotenouse = Math.sqrt(width*width + height*height);
        System.out.print("A tringle with width 42.0 and height 17.0 : ");
        System.out.print(hypotenouse);
        System.out.println("\nMathematically, sin(x)*sin(x) + "
                + "cos(x)*cos(x) - 1 should be 0.");
        System.out.println("Let’s check this for x = 1:");
        System.out.print(" sin(1)*sin(1) + cos(1)*cos(1) - 1 is ");
        System.out.println( Math.sin(1)*Math.sin(1)
                + Math.cos(1)*Math.cos(1) - 1 );
        System.out.println("(There can be round-off errors when"
                + " computing with real numbers!)");
        System.out.print("\nHere is a random number: ");
        System.out.println( Math.random() );
        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        System.out.print("\nRun time in seconds was: ");
        System.out.println(time);
    } // end main()
} // end class TimedComputation


