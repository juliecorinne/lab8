import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int j;
        int i;
        double sum = 0;
        double hits = 0;
        String userInput;

        int[][] atBat = new int[1][]; //jagged array
        //jagged array has different number of columns for each row

        System.out.println("Welcome to the Batting Average Calculator!");
        System.out.println();

        do {

        atBatMath(scan, sum, hits, atBat);

            System.out.println();
            System.out.println("Would you like to try another batter? yes/no");
            scan.nextLine();
            userInput = scan.nextLine();
            scan.nextLine();

        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Bye!");

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

            atBat[i] = new int[bat]; //creates the column

            System.out.println("0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Home Run");
            System.out.println();

            for (j = 0; j < atBat[i].length; j++) {

                System.out.println("Enter result for at-bat: ");
                atBat[i][j] = rangeValidator();

                hits = getHits(atBat[i][j], hits);

                sum = sum + atBat[i][j];

            }

            percentage = sum / bat;
            average = hits / bat;

            System.out.println();
            System.out.println("The batting average is: " + average);
            System.out.println();
            System.out.println("The slugging percentage is: " + percentage);

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

        //math for adding up how many hits
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
