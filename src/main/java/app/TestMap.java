package app;

import java.util.HashMap;
import java.util.HashSet;

public class TestMap {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put(null,1);
        map.put(null,2);

        System.out.println(map);

        HashSet<String> set = new HashSet<>();

        set.add(null);
        set.add(null);

        System.out.println(set);

    }
}
