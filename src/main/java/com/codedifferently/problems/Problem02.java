package com.codedifferently.problems;

import java.util.ArrayList;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        int stepsLeft = 0;
        for(int i = startIndex; stepsLeft < cousins.size(); i--){
            System.out.print (cousins.get(i) + " ");
            if(cousins.get(i).equals(targetName)) {
                break;
            }
            if(i == 0){
                i = cousins.size();
            }
            stepsLeft++;
        }
        System.out.println();

        int stepsRight = 0;
        for(int i = startIndex; stepsRight < cousins.size(); i++){
            System.out.print (cousins.get(i) + " ");
            if(cousins.get(i).equals(targetName)){
                break;
            }
            if(i == cousins.size()-1){
                i = -1;
            }
            stepsRight++;
        }
        System.out.println();
        return Math.min(stepsLeft, stepsRight);
    }
}
