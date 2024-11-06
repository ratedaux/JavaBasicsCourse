package homework40;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task2 {

    public static HashSet<String> union(Set<String> s1, Set<String> s2) {
        HashSet<String> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static HashSet<String> intersection(Set<String> s1, Set<String> s2) {
        HashSet<String> result = new HashSet<>(s1);
        result.retainAll(s2);
        return result;
    }

    public static Set<String> difference(Set<String> s1, Set<String> s2) {
        Set<String > set = new HashSet<>();
        set.addAll(s1);
        set.addAll(s2);

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String  item = it.next();
            if (s1.contains(item) && s2.contains(item)) {
                it.remove();
            }
        }
        return set;
    }

}
