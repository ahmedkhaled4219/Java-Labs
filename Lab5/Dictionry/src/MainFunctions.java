import java.util.*;


public class MainFunctions {
    TreeMap<Character, TreeSet<String>> map1 = new TreeMap<>();

    void insert(String... words) {
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                map1.computeIfPresent(firstChar, (key, existingSet) -> {
                    existingSet.add(word);
                    return existingSet;
                });
                map1.computeIfAbsent(firstChar, k -> new TreeSet<>(String.CASE_INSENSITIVE_ORDER)).add(word);
            }
            else{
                System.out.println("Ignoring word '" + word + "' as it doesn't contain only letters.");
            }
        }
    }
    void printDictionary() {
        for (Map.Entry<Character, TreeSet<String>> entry : map1.entrySet()) {
            System.out.println("Letter: " + entry.getKey() + ", Words: " + entry.getValue());
        }
    }

    void getWords(char key){
        key=Character.toUpperCase(key);
        if (map1.containsKey(key)) {
            TreeSet<String> words = map1.get(key);
            System.out.println("Words corresponding to letter '" + key + "': " + words);
        }
        else {
            System.out.println("No words found for letter '" + key + "'.");
        }
    }

    void removeWord(String word){
        char key = Character.toUpperCase(word.charAt(0));
        if (map1.containsKey(key)) {
            TreeSet<String> words = map1.get(key);
            if (words.remove(word)) {
                System.out.println("Removed word '" + word + "' from " +key);
                if (words.isEmpty()) {
                    System.out.println("This key " + key + " became empty");
                }
            }
            else{
                System.out.println("Word '" + word + "' Not Found.");
            }
        } else {
            System.out.println("letter '" + key + " 'Not Found.");
        }
    }

    void removeAllKey(char key){
        key=Character.toUpperCase(key);
        if(map1.containsKey(key)) {
          map1.remove(key);
          System.out.println("letter '" + key + " 'Removed with it's values.");
        }
        else{
            System.out.println("letter '" + key + " 'Not Found.");
        }
    }

    void search(String regex){
        List<String> matching=new ArrayList<>();
        for(TreeSet<String> words : map1.values()){
            for(String word : words ){
                if(word.matches(regex)){
                    matching.add(word);
                }
            }
        }
    if(matching.isEmpty()){
        System.out.println("No words found matching this regex " + regex);
    }
    else{
        System.out.println("Searching result is: " + matching);
    }
    }




}



