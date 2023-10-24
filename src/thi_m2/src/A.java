import sun.font.CreatedFontTracker;

import java.util.*;

public class A implements Comparable<String> {

    @Override
    public int compareTo(String o) {
        return 0;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("f");
        stringList.add("c");
        stringList.add("g");
        stringList.add("b");
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println("sort của comparator" + stringList);

        Collections.sort(stringList);
        System.out.println("sort cua comparable" + stringList);

    }


}