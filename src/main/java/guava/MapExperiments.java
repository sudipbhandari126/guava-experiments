package guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class MapExperiments {
    public static void main(String[] args) {
        Multimap<String, Object> multimap = ArrayListMultimap.create();
        multimap.put("hello","world");
        multimap.put("hello","people");
        for (String key: multimap.keySet()){
            System.out.println(multimap.get(key));
        }

    }

}
