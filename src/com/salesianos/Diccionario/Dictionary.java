package com.salesianos.Diccionario;

import java.util.*;

public class Dictionary {
private Map<Character, Set<String>> words;

public Dictionary() {
    words = new HashMap<>();
}

public void addWord(String word) {
    word = word.toLowerCase().trim();

    char initial = word.charAt(0);
    Set<String> wordSet = words.getOrDefault(initial, new HashSet<>());
    wordSet.add(word);
    words.put(initial, wordSet);
}

// APARTADO PARA ELIMINAR PALABRA //

public boolean deleteWord(String wordToDelete) {
    wordToDelete = wordToDelete.toLowerCase().trim();
    char initial = wordToDelete.charAt(0);
    if (words.containsKey(initial)) {
        Set<String> wordSet = words.get(initial);
        if (wordSet.contains(wordToDelete)) {
            wordSet.remove(wordToDelete);
            return true;
        } else {
            
            return false;
        }
    } else {
       
        return false;
    }
}

// APARTADO PARA ENCONTRAR PALABRA //

public boolean containsWord(String wordToFind) {
    wordToFind = wordToFind.toLowerCase().trim();
    char initial = wordToFind.charAt(0);
    if (words.containsKey(initial)) {
        Set<String> wordSet = words.get(initial);
        if (wordSet.contains(wordToFind)) {
            
            return true;
        } else {
           ;
            return false;
        }
    } else {
        
        return false;
    }
}

// APARTADO PARA INICIAL //

public List<String> getWordsByInitial(char initial) {
    Set<String> wordSet = words.getOrDefault(initial, Collections.emptySet());
    return new ArrayList<>(wordSet);
}

public Set<Character> getInitials() {
    return words.keySet();
}

public void printAllWords() {
    for (char initial : words.keySet()) {
        Set<String> wordSet = words.get(initial);
        System.out.println(initial + ": " + wordSet);
    }
}
}