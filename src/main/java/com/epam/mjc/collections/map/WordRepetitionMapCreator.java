package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence == null || sentence.isEmpty())
            return new HashMap<>();
        String[] words = sentence.toLowerCase().split("\\s*[\\W]+\\s*");
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        for (String word : words) {
            if (wordRepetitionMap.containsKey(word)) {
                wordRepetitionMap.put(word, wordRepetitionMap.get(word) + 1);
            } else {
                wordRepetitionMap.put(word, 1);
            }
        }
        return wordRepetitionMap;
    }
}
