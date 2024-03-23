package Ch27_HashMap;

import java.util.HashMap;

public class Ex4_MapInMap {
    public static void main(String[] args) {
        HashMap<Integer, String> innerMap1 = new HashMap<>();
        innerMap1.put(1, "a" );
        innerMap1.put(2, "s" );
        innerMap1.put(3, "d" );

        HashMap<Integer, String> innerMap2 = new HashMap<>();
        innerMap2.put(1, "qwe" );
        innerMap2.put(44, "asd" );
        innerMap2.put(52, "zxc" );


        HashMap<String, HashMap<Integer, String>> map = new HashMap<>();

        map.put("el1", innerMap1);
        map.put("el2", innerMap2);


        System.out.println(map);
    }
}
