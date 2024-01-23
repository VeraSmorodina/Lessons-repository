package Task18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main18 {
    public static void main(String[] args) {
        ArrayList<Integer> x = search(generateList(), 9);
    }

    public static ArrayList<Integer> generateList() {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array.add(random.nextInt(10) + 1);
        }
        return array;
    }

    public static ArrayList<Integer> search(ArrayList<Integer> values, int N) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < values.size(); i++) {
            int key = values.get(i);
            if (map.get(key) == null) {
                map.put(key, 1);
                continue;
            }
            map.put(key, map.get(key) + 1);
            if (map.get(key) == N) {
                result.add(key);
            }
        }
        return result;
    }

    public static void fillMap() {
        ArrayList<Integer> array = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            array.add(i + 1);
        }

        for (int i = 0; i < array.size(); i++) {
            map.put(array.get(i), " values" + (i + 1));
        }
        for (String i : map.values()) {
            System.out.println(i);
        }
        map.clear();
    }
}
