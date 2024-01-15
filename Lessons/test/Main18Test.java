import Task18.Main18;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class Main18Test {
    @Test
    public void test1() {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(1);
        number.add(1);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        ArrayList<Integer> list1 = Main18.search(number, 4);
        assertEquals(2, (int) list1.get(0));
    }
}
