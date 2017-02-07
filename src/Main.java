import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double sum = 0;
        double hits = 0;
        String userInput;

        int[][] atBat = new int[1][];
        //jagged array - has different number of columns for each row

        System.out.println("Welcome to the Batting Average Calculator!");
        System.out.println();

        do {

            atBatMath(scan, sum, hits, atBat);

            userInput = userContinue(scan);

        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("Bye!");

        //method is called inside the do while loop, easier to read

    }

    public static String userContinue(Scanner scan) {

        String userInput;
        System.out.println();
        System.out.println("Would you like to try another batter? Y/N");
        scan.nextLine();
        userInput = scan.nextLine();
        System.out.println();

        return userInput;

        //asks user if they would like to continue
        //collects user input and proceeds accordingly

    }

    public static void atBatMath(Scanner scan, double sum, double hits, int[][] atBat) {

        int i;
        int j;
        double percentage;
        double average;

        for (i = 0; i < atBat.length; i++) {

            System.out.println("Please enter a number of times at bat: "); //collects the number of columns
            int bat = scan.nextInt();
            System.out.println();

            atBat[i] = new int[bat]; //creates the columns

            System.out.println("0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Home Run");
            System.out.println();

            for (j = 0; j < atBat[i].length; j++) {

                System.out.println("Enter result for at-bat: ");
                atBat[i][j] = rangeValidator();

                hits = getHits(atBat[i][j], hits);

                sum = sum + atBat[i][j];

            }

            percentage = sum / bat; //sum of the result for at-bat / bat # user inputed
            average = hits / bat;

            System.out.println();
            System.out.printf("The batting average is: %.3f\n", average); //%.3f formats to 3 decimal places, f is used for float
            System.out.println();
            System.out.printf("The slugging percentage is: %.3f\n", percentage);

            //gathers info for each hit, calculates sum and hits
            //calculates percentage and average
            //prints out values

        }
    }

    public static double getHits(int i, double hits) {

        if (i != 0) {
            hits++;
        }

        return hits;

        //math for adding up how many hits (numbers != 0)
    }

    public static int rangeValidator() {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        while (input < 0 || input > 4) {

            System.out.println("Please enter a number between 0 and 4!");
            input = scan.nextInt();
        }

        return input;

    }

}
