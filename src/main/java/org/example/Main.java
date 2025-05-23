package org.example;
import org.example.entity.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("-------------------------------------------------");

        Set<String> uniqueWords = StringSet.findUniqueWords();
        System.out.println("Unique kelime sayısı: " + uniqueWords.size());
        System.out.println("Alfabetik sıralı unique kelimeler:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}