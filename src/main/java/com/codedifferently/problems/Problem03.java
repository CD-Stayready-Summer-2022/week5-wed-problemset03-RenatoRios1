package com.codedifferently.problems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntBinaryOperator;

public class Problem03 {
    /**
     * You will be given an integer called number and an array called possibleFamilyMembers
     * your jobs is to find the number's family members. A family member is any value that's with in
     * 1 of any other number in the family.
     *
     * So for example if the number = 4, and the possibleFamilyMembers is [1,4,3,5]
     * The actualFamilyMembers would be [3,4,5]
     * 3 is 1 away from 4
     * 4 is equal to 4
     * 4 is 1 away from 5
     * while
     * 1 is not included because the closest releation to 1 is 3 and that's 2 away.
     * @param number
     * @param possibleFamilyMembers
     * @return
     */
    public Integer[] numberFamily(Integer number, Integer[] possibleFamilyMembers){

        HashMap<Integer, Integer> nums = new HashMap<>();

        for(int i = 0; i < possibleFamilyMembers.length; i++){
            if(nums.containsKey(possibleFamilyMembers[i])){
                nums.put(possibleFamilyMembers[i], nums.get(possibleFamilyMembers[i]) +1);
            }else{
                nums.put(possibleFamilyMembers[i], 1);
            }
        }

        List<Integer> output = new ArrayList<>();
        int indexDec = 1;
        if(nums.containsKey(number)){
            output.add(number);
        }
        while(true){
            if(nums.containsKey(number - indexDec)){
                output.add(0, number-indexDec);
            }else{
                break;
            }
            indexDec++;
        }
        int indexInc = 1;
        while(true){
            if(nums.containsKey(number + indexInc)){
                output.add(number+indexInc);
            }else{
                break;
            }
            indexInc++;
        }
        Integer[] array = output.toArray(new Integer[0]);
        return array;
    }
}
