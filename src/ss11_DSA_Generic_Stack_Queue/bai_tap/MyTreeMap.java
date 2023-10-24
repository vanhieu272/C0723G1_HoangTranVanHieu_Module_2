package ss11_DSA_Generic_Stack_Queue.bai_tap;

import java.util.TreeMap;

public class MyTreeMap {
    TreeMap<String, Integer> stringTreeMap = new TreeMap<>();

    public String countAppearance(String stringInput) {
        String[] newArray;
        int count;
        String result;
        newArray = stringInput.split(" ");
        for (String word : newArray) {
            if (!stringTreeMap.containsKey(word)) {
                stringTreeMap.put(word, 1);
            } else {
                count = stringTreeMap.get(word);
                stringTreeMap.put(word, count + 1);
            }
        }
        result = stringTreeMap.toString();
        return result;
    }

    public static void main(String[] args) {
        String stringTest = "Dam Dam Xuan Tuong Tuong Tuong";
        MyTreeMap myTreeMap = new MyTreeMap();
        System.out.println(myTreeMap.countAppearance(stringTest));
    }
}
