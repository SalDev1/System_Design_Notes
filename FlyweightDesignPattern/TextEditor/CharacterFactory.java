package FlyweightDesignPattern.TextEditor;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<Character, DocumentCharacter> characterCache = new HashMap<>();

    public static DocumentCharacter createLetter(char character) {
        if(characterCache.containsKey(character)) {
            return characterCache.get(character);
        } else {
            DocumentCharacter characterObj = new DocumentCharacter(character, "Arial", 10);
            characterCache.put(character, characterObj);
            return characterObj;
        }
    }
}
