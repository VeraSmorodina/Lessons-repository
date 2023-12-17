import Task13.Main;
import org.junit.Test;
import static org.junit.Assert.*;



public class Test1 {
    @Test
    public void test1(){
        int[] array = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main.sort1(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void test2(){
        int[] testArray = {};
        int[] expected = {};
        Main.sort1(testArray);
        assertArrayEquals(expected, testArray);
    }
    @Test
    public void test3(){
        int[] array = {10, 2, 8, 6, 7, 3, 5, 4, 9, 1, -1, 0, -2};
        int[] expected = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main.sort1(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void test4(){
        int[] array = {2, 8, 6, 7, 3, 5, 4, 9, 1, -1, 0, -2, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] expected = {Integer.MIN_VALUE, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE};
        Main.sort1(array);
        assertArrayEquals(expected, array);
    }
}


