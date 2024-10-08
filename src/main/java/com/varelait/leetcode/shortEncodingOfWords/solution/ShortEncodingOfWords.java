package com.varelait.leetcode.shortEncodingOfWords.solution;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class ShortEncodingOfWords {

    public static int minimumLengthEncoding(String[] words) {

        if (words.length > 0) {
            List<String> uniqueWords = new ArrayList<>();
            uniqueWords.add(words[0]);
            int lengthCount = words[0].length() + 1;
            String unique = null;
            int uniqueLength = 0;
            int wordLength = 0;
            String uniqueSufix = null;
            String wordSufix = null;

            for (int i = 1; i < words.length; i++) {
                boolean contains = false;

                for (int s = 0 ; s < uniqueWords.size(); s++) {
                    unique = uniqueWords.get(s);
                    if (unique.equals(words[i])){
                        contains = true;
                        break;
                    }

                    uniqueLength = unique.length();
                    wordLength = words[i].length();

                    if (uniqueLength > wordLength){
                        uniqueSufix =  unique.substring(uniqueLength - wordLength);
                        if (uniqueSufix.equals(words[i])){
                            contains = true;
                            uniqueSufix = null;
                            break;
                        }
                    }

                    if (uniqueLength < wordLength){
                        wordSufix =  words[i].substring(wordLength - uniqueLength);
                        if (wordSufix.equals(unique)) {
                            contains = true;
                            lengthCount -= uniqueLength + 1;
                            lengthCount += wordLength + 1;
                            break;
                        }
                    }
                }

                if (!contains)
                    lengthCount += words[i].length() + 1;
            }

            return lengthCount;
        }

        return 0;
    }

}
