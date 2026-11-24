
package controller;

import model.Dictionary;

public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController() {

        dictionary = new Dictionary();

        dictionary.addWord("apple", "A fruit that can be red or green.");
        dictionary.addWord("computer", "An electronic device.");
        dictionary.addWord("book", "A set of written pages.");
        dictionary.addWord("java", "A programming language.");
        dictionary.addWord("water", "A liquid that people need to survive.");
        dictionary.addWord("student", "A person who studies.");
    }

    public String search(String word) {

        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word!";
        }

        String meaning = dictionary.searchWord(word.trim());

        if (meaning == null) {
            return "Word not found in the dictionary!";
        }

        return meaning;
    }
}
