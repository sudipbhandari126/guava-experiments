package guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Multimap;

public class MapExperiments {
    public static void main(String[] args) {
        //multiMap();
        bimaps();
    }


    private static void multiMap() {
        Multimap<String, Object> multimap = ArrayListMultimap.create();
        multimap.put("hello","world");
        multimap.put("hello","people");
        for (String key: multimap.keySet()){
            System.out.println(multimap.get(key));
        }
    }

    private static void bimaps(){
        BiMap<String, String> capitalCountryBiMap = HashBiMap.create();
        capitalCountryBiMap.put("New Delhi", "India");
        capitalCountryBiMap.put("Washington, D.C.", "USA");
        capitalCountryBiMap.put("Moscow", "Russia");

        //capitalCountryBiMap.put("blah","Russia");
        //this will throw "java.lang.IllegalArgumentException: value already present"
        //can use forcePut instead
        capitalCountryBiMap.forcePut("Lenin","Russia");

        String keyFromBiMap = capitalCountryBiMap.inverse().get("Russia");
        String valueFromBiMap = capitalCountryBiMap.get("Washington, D.C.");

        System.out.println("keyFromBiMap = " +keyFromBiMap);
        System.out.println("ValueFromBiMap = " +valueFromBiMap);
    }

}
