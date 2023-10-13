package utils;

/**
 * Utility class containing methods for exercises.
 *
 * This class provides static methods for various operations on integers and strings.
 *
 * @author D00260376
 */
public class ExerciseUtilities {
    /**
     * Checks if the given integer is odd.
     *
     * @param a The integer to be checked.
     * @return true if the integer is odd, false otherwise.
     */
    public static boolean isOdd(int a){
        return a % 2 != 0;
    }

    /**
     * Multiplies every odd number in the input array by 2.
     *
     * @param array The input array of integers.
     */
    public static void evenOut(int[] array){
        for(int i = 0; i < array.length; i++){
            if(isOdd(array[i])){
                array[i] = array[i] * 2;
            }
        }
    }

    /**
     * Finds the longest string in the input array.
     *
     * @param array The input array of strings.
     * @return The longest string in the array. Returns null if the input array is empty.
     */
    public static String findLongest(String[] array){
        if(array.length == 0){
            return null;
        } else {
            String longest = array[0];
            for(String str : array){
                if (str.length() > longest.length()){
                    longest = str;
                }
            }
            return longest;
        }
    }
}
