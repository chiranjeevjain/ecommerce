package com.voodoo.server.algos;

public class TitleSimilarity {

    public static double similarityIndex(String a, String b){
        int wordDistance = Levenshtein.wordComparision(a,b);
        return 10*CosineSimilarity.wordSimilarity(a,b) - Math.sqrt(wordDistance*wordDistance+Levenshtein.charComparision(a,b));
    }
}
