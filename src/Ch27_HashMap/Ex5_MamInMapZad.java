package Ch27_HashMap;

import java.util.HashMap;

public class Ex5_MamInMapZad {
    public static void main(String[] args) {
        HashMap<String, Integer> clothes = new HashMap<>();
        HashMap<String, Integer> agd = new HashMap<>();
        HashMap<String, Integer> rtv = new HashMap<>();

        clothes.put("trousers", 100);
        clothes.put("thirts", 123);
        clothes.put("jackets", 12);

        agd.put("washingmachines", 23);
        agd.put("fridges", 34);

        rtv.put("tvs", 52);
        rtv.put("soundbars", 67);

        HashMap<Integer,  HashMap<String, Integer>> categories = new HashMap<>();

        categories.put(11,clothes);
        categories.put(12,agd);
        categories.put(13,rtv);

        System.out.println(categories);
    }
}

/**
 * 1:
 * zorb 3x mapy <String, Integer> klucz - nazwa kategorii w sklepie, oraz wartość - ilość produktow
 *
 * 2:
 * zrob 1x mape zawieracjaca mape jako wartosc  <Integer, <String, Integer>>  klucz - ID kategorii, wartość to mapa z pkt 1
 *
 * dodaj do tej mapy, 3 mapy z pkt 1
 */
