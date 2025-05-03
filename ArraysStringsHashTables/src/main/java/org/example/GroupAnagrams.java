package org.example;

import java.util.*;

/*
 *
 * Anagrams are words or phrases formed by rearranging the letters of another word or phrase.
 * Some common examples include "listen" and "silent", "save" and "vase", and "act" and "cat".
 *
 *  Input: words = ["saco", "arresto", "programa", "rastreo", "caso"]
 *  Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return Collections.emptyList();

        Map<String, List<String>> anagramMap = buildAnagramMap(strs);
        return new ArrayList<>(anagramMap.values());
    }

    private Map<String, List<String>> buildAnagramMap(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<String, List<String>>();
        for (String s : strs) {
            String hash = getAnagramHash(s);
            System.out.println(hash);
            if (!anagramMap.containsKey(hash)) {
                anagramMap.put(hash, new ArrayList<String>());
            }
            anagramMap.get(hash).add(s);
        }
        return anagramMap;
    }

    private String getAnagramHash(String s) {
        int[] letterCount = new int[26];
        for (int c : s.toCharArray()) {
            letterCount[c - 'a']++;
        }
        return Arrays.toString(letterCount);
    }
}
