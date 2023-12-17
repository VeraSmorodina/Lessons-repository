package Task13;

public class Main {
    public static void main(String[] args) {
        //Первый вид теста - черный ящик
        System.out.println("Пример 1");
        int[] array = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            sort1(array);
            if (!arrayEquals(array, expected)) {
                throw new Exception();
            }
            System.out.println("Тест пройден. Массивы равны");
        } catch (Exception e) {
            System.out.println("Массивы не равны");
        }


        //Второй вид теста - белый ящик
        System.out.println("Пример 2");
        int[] testArray = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1};

        try {
            sort1(testArray);
            // Проверка результатов сортировки
            assertSorted(testArray);
            // Вывод отсортированного массива
            printArray(testArray);
            System.out.println();
            System.out.println("Тест пройден. Массив отсортирован корректно.");
        } catch (AssertionError e) {
            System.out.println("Тест не пройден. Массив отсортирован некорректно.");
            System.out.println(e.getMessage());
        }
    }


    public static void sort1(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void assertSorted(int[] array) throws AssertionError {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                throw new AssertionError("Массив не отсортирован: элемент на позиции " + i + " больше элемента на позиции " + (i + 1));
            }
        }
    }


    public static void printArray(int[] array2) {
        System.out.print("Отсортированный массив: ");
        for (int value : array2) {
            System.out.print(value + " ");
        }
    }

    public static boolean arrayEquals(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }
}
