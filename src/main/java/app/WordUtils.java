package app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordUtils {

    public static String getShortestWord(List<String> words) throws IllegalArgumentException{

        if (words.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }

        String res = words.get(0);

        for (int i=1; i<words.size(); i++) {

            String curWord = words.get(i);

            if (res.length() > curWord.length()){
                res = curWord;
            }
        }


        return res;

    }

    public static Map getCountWords(String text){

        HashMap<String,Integer> map = new HashMap<>();

        String[] arr = text.toLowerCase().split(" ");

        for (String s: arr) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        return map;

    }

}
