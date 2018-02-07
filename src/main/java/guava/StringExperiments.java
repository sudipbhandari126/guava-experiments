package guava;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;

import java.nio.charset.Charset;
import java.util.Objects;

public class StringExperiments {
    static  String[] stringList = {"I","am","awe"};
    public static void main(String[] args) {
        //Joining strings
        String a = Joiner.on(",").skipNulls().join(stringList);
        System.out.println(a);
        //converting string to bytes
        //all six supported charsets are enumerated: no typos
        byte[] stringBytes = "hello".getBytes(Charsets.UTF_8);

    }

    /*
    Utility method to generate hashCode of an object
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(stringList);
    }
}
