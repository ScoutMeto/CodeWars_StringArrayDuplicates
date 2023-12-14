package org.example;

public class Solution {


    public static String[] dup(String[] arr) { //input is string array

        String[] result = new String[arr.length];   //method create a new array "result"

        for (int i = 0; i < arr.length; i++) {  //loop iterate every one string at index and call method "removeConsecutiveDuplicates periodically
            result[i] = removeConsecutiveDuplicates(arr[i]);
        }
        return result;  //new array as output - with new strings at indexes (strings without repeated characters)
    }

    private static String removeConsecutiveDuplicates(String word) {    //"inside method" / inside loop method
        char previousChar = 0;
        StringBuilder sb = new StringBuilder(); //instance of SB - this is the cointainer for sequential adding character by character
        for (Character ch : word.toCharArray()) {   //loop which compare character with previous character...
            if (previousChar != ch) {
                sb.append(ch);                      //...and add charater only in case it is different from previous
            }
            previousChar = ch;
        }
        return sb.toString();       //return StringBuilder instance "sb" as String

    }
}

/*
Methods for transormation input array to new array. To the new array (to the each index, respectively),
will be added only the character, which is different from previous character.
 */