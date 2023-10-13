package part1_exercises;

import utils.FileHandlingUtilities;

import java.util.Arrays;

/**
 *
 * @author michelle
 */
public class Part1_1 {

    public static void main(String[] args) {
        // Reading in a file of numbers
        // This will read in the file specified and return an array containing all the numbers from that file
        int[] fileNumbers = FileHandlingUtilities.readNumericFile("SampleInput/Part1SampleInput2.txt");

        //Set this variable as a odd counter
        int oddCount = 0;

        //Go through the whole array and check how many odd numbers is in
        for (int i : fileNumbers) {
            if(utils.ExerciseUtilities.isOdd(i)){
                oddCount++;
            }
        }

        //Print out the counter and then subtract array lenght and counter to get even numbers
        System.out.println("You entered " + (fileNumbers.length-oddCount) + " even and " + oddCount + " odd numbers.");

        //Print out the array in original state
        System.out.println(Arrays.toString(fileNumbers));

        //Using method to multiply every odd number by 2
        utils.ExerciseUtilities.evenOut(fileNumbers);

        //Printing out the array in updated version
        System.out.println(Arrays.toString(fileNumbers));
    }

}
