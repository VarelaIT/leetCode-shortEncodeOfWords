package com.varelait.leetcode.shortEncodingOfWords;

import com.varelait.leetcode.shortEncodingOfWords.inputs.LongInputTestCase;
import com.varelait.leetcode.shortEncodingOfWords.solution.ShortEncodingOfWords;

import java.sql.Array;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to Leetcode: 820. Short Encoding Of Words...\n");

        System.out.println("\n\tFor [\"time\",\"me\",\"bell\"] the solution is: " + ShortEncodingOfWords.minimumLengthEncoding(new String[]{"time", "me", "bell"}));
        System.out.println("\n\tFor [\"time\",\"me\",\"time\",\"bell\"] the solution is: " + ShortEncodingOfWords.minimumLengthEncoding(new String[]{"time", "me", "bell"}));
        System.out.println("\n\tFor [\"me\",\"time\"] the solution is: " + ShortEncodingOfWords.minimumLengthEncoding(new String[]{"me","time"}));
        System.out.println("\n\tFor [\"feipyxx\",\"e\"] the solution is: " + ShortEncodingOfWords.minimumLengthEncoding(new String[]{"feipyxx","e"}));
        System.out.println("\n\tFor very long input the solution is: " + ShortEncodingOfWords.minimumLengthEncoding(LongInputTestCase.longInput));

    }

}
