package com.voodoo.server.algos;

public class Levenshtein {

    public static int charComparision(String a, String b){
        int[][] lenMatrix = new int[a.length()+1][b.length()+1];
        for(int i=0;i<=a.length();i++){
            lenMatrix[i][0] = i;
        }
        for(int j=0;j<=b.length();j++){
            lenMatrix[0][j] = j;
        }

        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                int cost = b.charAt(j-1)==a.charAt(i-1)?0:1;
                lenMatrix[i][j] = Math.min(Math.min(lenMatrix[i-1][j]+1,lenMatrix[i][j-1]+1),lenMatrix[i-1][j-1]+cost);
            }
        }
        return lenMatrix[a.length()][b.length()];
    }

    public static int wordComparision(String a, String b){
        String[] aWords = a.split(" ");
        String[] bWords = b.split(" ");
        int[][] lenMatrix = new int[aWords.length+1][bWords.length+1];

        for(int i=0;i<=aWords.length;i++){
            lenMatrix[i][0] = i;
        }
        for(int j=0;j<=bWords.length;j++){
            lenMatrix[0][j] = j;
        }

        for(int i=1;i<=aWords.length;i++){
            for(int j=1;j<=bWords.length;j++){
                int cost = bWords[j-1].equalsIgnoreCase(aWords[i-1])?0:1;
                lenMatrix[i][j] = Math.min(Math.min(lenMatrix[i-1][j]+1,lenMatrix[i][j-1]+1),lenMatrix[i-1][j-1]+cost);
            }
        }
        return lenMatrix[aWords.length][bWords.length];
    }

}
