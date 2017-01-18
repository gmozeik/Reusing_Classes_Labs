import java.util.*;

/**
 * Created by gerrodmozeik on 1/18/17.
 */
public class ArrayRotator {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six".split(" "));
        System.out.println("List :"+list);
        Collections.rotate(list, 1);
        System.out.println("rotate: " + list);
    }
}
