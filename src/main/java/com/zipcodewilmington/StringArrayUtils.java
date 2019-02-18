package com.zipcodewilmington;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }
    //Brackets notate "get "

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (String word : array) {
            if (word.equals(value)) {
                return true;
            }

        }
        return false;


    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int arrayLength = array.length;                 //get array length
        String[] result = new String[arrayLength];   // create an array
        for (int i = array.length - 1; i >= 0; i--) {        // iterate through array backwards
            String currentWord = array[i];              //get current string from CurrentIndex

            int newArrayIndex = (arrayLength - i) - 1; // get new array index
            result[newArrayIndex] = currentWord;// place current string in new array
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        return Arrays.equals(array, reversedArray);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    // .toString
    public static boolean isPangramic(String[] array) {
        String string = Arrays.toString(array).toLowerCase();
        for (char letter = 'a'; letter < 'z'; letter++) {
            String newString = "" + letter;
            if (string.contains(newString) == false) {
                return false;

            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                count++;
            }


        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int arrayLength = array.length - getNumberOfOccurrences(array, valueToRemove);    //get array length minus the number of occurences
        String[] result = new String[arrayLength]; //create a new array
        int index = 0;                              // create int
        for (int i = 0; i < array.length; i++) {  // loop over array
            String currentWord = array[i];     // current word at index i
            if (!currentWord.equals(valueToRemove)) { //if current word does not equal value
                   result[index] = currentWord; //place word at said index
                   index++;                     // increment index
            }
        }
        return result;
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int arrayLength = array.length;

        ArrayList<String> newList = new ArrayList<String>();

        // Always add first value
        newList.add(array[0]);

        // Iterate the remaining values
        for(int i = 1; i < arrayLength; i++) {
            // Compare current value to previous
            if(array[i-1] != array[i]) {
                newList.add(array[i]);
            }
        }

        return newList.toArray(new String[newList.size()]);


    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String [] result = new String[array.length];

        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length; j++) {

                if (array[i].equals(array[j])) {
                    result[i] += array[j];
                }
            }
        }
        return result;
    }

}



