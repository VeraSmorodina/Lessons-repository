package task13_upd;

public class Main133 {
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
