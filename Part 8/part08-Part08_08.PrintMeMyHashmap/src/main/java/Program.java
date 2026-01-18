import java.util.HashMap;

public class Program {
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String contents : hashmap.keySet()) {
            System.out.println(contents);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String contents : hashmap.keySet()) {
            if (contents.contains(text)) {
                System.out.println(contents);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String contents : hashmap.keySet()) {
            if (contents.contains(text)) {
                System.out.println(hashmap.get(contents));
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}