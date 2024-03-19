package estudo.g10.ex4;

import java.io.*;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) throws IOException{
        Set<String> words = new HashSet<>();
        loadSet(words, "src/estudo/g10/ex4/words.txt");
        wordsEndS(words);
        System.out.println(words);

    }

    public static void removeNoLetters(Set<String> words){
        Set<String> set = new HashSet<>();
        for(String word : words){
            if(word.matches("[a-zA-Z]+")){
                set.add(word);
            }
        }
        words.clear();
        words.addAll(set);
    }

    public static void loadSet(Set<String> words, String path) throws IOException{
        Scanner input = new Scanner(new FileReader(path));
        while (input.hasNext()) {
            String word = input.next();
            if(word.length() > 2){
                words.add(word);
            }
        }
    }

    public static void wordsEndS(Set<String> words){
        for(String word : words){
            if(word.endsWith("s")){
                System.out.println(word);
            }
        }
    }
}

