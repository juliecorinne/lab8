import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int j;
        int i;
        double sum = 0;
        double average = 0;
        double hits = 0;
        double percentage = 0;

        int[][] atBat = new int[1][]; //jagged array
        //jagged array has different number of columns for each row

        System.out.println("Welcome to the Batting Average Calculator!");
        System.out.println();

        for (i = 0; i < atBat.length; i++) {

            System.out.println("Please enter a number of times at bat: ");
            int bat = scan.nextInt();
            System.out.println();

            atBat[i] = new int[bat]; //create the column array

            System.out.println("0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Home Run");
            System.out.println();

            for (j = 0; j < atBat[i].length; j++) {

                    System.out.println("Enter result for at-bat: ");
                    atBat[i][j] = scan.nextInt();

                   if (atBat[i][j] != 0) {
                       hits++;
                   }

                   sum = sum + atBat[i][j];

                }

                percentage = sum / bat;
                average = hits / bat;

            System.out.println();
            System.out.println("The batting average is: " + average);
            System.out.println();
            System.out.println("The slugging percentage is: " + percentage);

            }

        }


}
