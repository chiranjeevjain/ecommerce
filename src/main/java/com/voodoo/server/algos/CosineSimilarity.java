package com.voodoo.server.algos;

import java.util.*;

public class CosineSimilarity {

    public static double wordSimilarity(String a, String b){
        List<String> aWords = Arrays.asList(a.split(" "));
        List<String> bWords = Arrays.asList(b.split(" "));

        Set<String> uniqueSet = new HashSet<>();

        //aWords.stream().forEach(word -> uniqueSet.add(word));
        //bWords.stream().forEach(word -> uniqueSet.add(word));
        
        for(String word : aWords) {
        	uniqueSet.add(word);
        }
        for(String word : bWords) {
        	uniqueSet.add(word);
        }

        List<Integer> aVector = new ArrayList<>();
        List<Integer> bVector = new ArrayList<>();

       //uniqueSet.stream().forEach(uniqueWord -> {
        for(String uniqueWord : uniqueSet) {
            if(aWords.contains(uniqueWord)){
                aVector.add(Collections.frequency(aWords,uniqueWord));
            }else{
                aVector.add(0);
            }
            if(bWords.contains(uniqueWord)){
                bVector.add(Collections.frequency(bWords,uniqueWord));
            }else{
                bVector.add(0);
            }
        };
        return computeCosineValue(aVector,bVector);
    }

    private static double computeCosineValue(List<Integer> vector1,List<Integer> vector2){
        int product = 0;
        int vector1Mag = 0;
        int vector2Mag = 0;

        for(int i=0;i<vector1.size();i++){
            product+=vector1.get(i)*vector2.get(i);
            vector1Mag+=vector1.get(i)*vector1.get(i);
            vector2Mag+=vector2.get(i)*vector2.get(i);
        }

        return product/(Math.sqrt(vector1Mag)* Math.sqrt(vector2Mag));
    }
}
