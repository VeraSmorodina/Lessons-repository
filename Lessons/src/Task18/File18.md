```java
public class Main18 {
    public static void main(String[] args) {
        fillMap();
        search(generateList(), 9);
    }
    //Задание 2
    public static ArrayList<Integer> generateList(){
        ArrayList <Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array.add(random.nextInt(10)+1);
        }
        return array;
    }
    //Задание 2
    public static ArrayList<Integer> search(ArrayList<Integer> values, int N){
        ArrayList <Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < values.size(); i++) {
            int key = values.get(i);
            if (map.get(key) == null){
                map.put(key, 1);
                continue;
            }
            map.put(key, map.get(key) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) >= N)
                result.add(key);
        }
        return result;
    }
    //Задание 1
    public static void fillMap(){
        ArrayList <Integer> array = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            array.add(i+1);
        }

        for (int i = 0; i < array.size(); i++) {
            map.put(array.get(i), " values" + (i+1));
        }
        for (String i : map.values()) {
            System.out.println(i);
        }
        map.clear();
    }
}

```




Рефлексия по предыдущему:

В задании 4.1 можно было реализовать решение куда менее обьемным способом, 
использовав метод scanDir, который возвращает список из списков 
файлов заданного формата. 

Решение в задании 4.2 похожее, 