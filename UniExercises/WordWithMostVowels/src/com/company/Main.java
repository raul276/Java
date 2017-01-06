package com.company;
//проверява коя дума има най много гласни
public class Main {
    static final char[] VOWELS = {'a','y','o','u','e','i'};

    public static void main(String[] args) {

        String[] words = new String[]{"dinozavar", "kofa","ogledalo","pofa","mofa","sinozit","dinosavaryt"};
        System.out.println(getWordWithMostVowels(words));

    }

    public static String getWordWithMostVowels(String[] words) {
        int maxLenght = 0;
        String maxLenghtWord = null;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] wordLetters = word.toCharArray();
            int currentVowels = 0;
            for (int j = 0; j < wordLetters.length; j++) {
                for (int k = 0; k < VOWELS.length; k++) {
                    if (wordLetters[j] == VOWELS[k]) {
                        currentVowels++; //break; (при случай ако искаме да спрем при получено попадение
                    }
                }
            }
            if (currentVowels > maxLenght) {
                maxLenght = currentVowels;
                maxLenghtWord = word;
            }
        }
        return maxLenghtWord;
    }
        throw new

    UnsupportedOperationException() {

    }
}

