import Task13.Main;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Main13Test {
    @Test
    public void test1() {
        //Первый вид теста - белый ящик
        System.out.println("Пример 1");
        int[] array = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main.sort1(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void test2() {
        //Второй вид теста - черный ящик
        System.out.println("Пример 2");
        int[] testArray = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1};
        int[] testArray1 = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1};
        Main.sort1(testArray);
        Arrays.sort(testArray1);
        assertArrayEquals(testArray1, testArray);//проверяем одинаково ли сортирует массив мой метод и метод из стандартной библиотеки
    }

    @Test
    public void test3() {
        int[] testArray = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1};
        int[] testArray1 = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1};
        boolean a = Main.arrayEquals(testArray, testArray1);
        boolean b = Arrays.equals(testArray, testArray1);
        assertEquals(b, a);
    }

    @Test
    public void test4() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 4, 3, 2, 1};
        try {
            Main.assertSorted(sortedArray);
        } catch (AssertionError e) {
            fail("Метод выбросил исключение для отсортированного массива: " + e.getMessage());
        }
        try {
            Main.assertSorted(unsortedArray);
            fail("Метод не выбросил исключение для неотсортированного массива");
        } catch (AssertionError e) {
            assertEquals("Массив не отсортирован: элемент на позиции 0 больше элемента на позиции 1", e.getMessage());
        }
    }
}
