package guava;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class SetExperiments {
    public static void main(String[] args) {
        multiSets();
    }

    /*
    This is also called Bag. Put item and keep a count of them
     */
    private static void multiSets(){
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("hello");
        multiset.add("hello");
        System.out.println(multiset.count("hello"));
        multiset.remove("hello");
        System.out.println(multiset.count("hello"));
        multiset.add("hello",345);
        System.out.println(multiset.count("hello"));
    }
}
