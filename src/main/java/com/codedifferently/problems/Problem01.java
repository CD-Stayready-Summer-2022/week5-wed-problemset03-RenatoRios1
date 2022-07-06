package com.codedifferently.problems;

import java.util.HashMap;
import java.util.Locale;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        input = input.toLowerCase(Locale.ROOT);
        System.out.println(input);
        HashMap<Character, Integer> chars = new HashMap<>();
        for(int i = 0; i < input.length(); i++){
            if(Character.isAlphabetic(input.charAt(i))) {
                if (chars.containsKey(input.charAt(i))) {
                    chars.put(input.charAt(i), chars.get(input.charAt(i)) + 1);
                } else {
                    chars.put(input.charAt(i), 1);
                }
            }
        }
        Character lookingFor = letter.toLowerCase(Locale.ROOT).toCharArray()[0];
        return chars.get(lookingFor);
    }
}
