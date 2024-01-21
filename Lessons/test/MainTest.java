import Task14.Main;
import Task14.Main1;
import Task14.Main2;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.File;
import java.util.ArrayList;

public class MainTest {
    @Test
    public void test1() {
        Main main = new Main();
        main.createFiles();
        String mainPath = "/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/";
        for (int i = 1; i <= 10; i++) {
            String path = mainPath + i +".txt";
            System.out.println(path);
            File my_fil = new File(path);
            assertTrue(my_fil.exists());
        }
    }
    @Test
    public void sumTest1(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        Integer[] s = Main1.sum(arrayList, "/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/");
        int expected = 39;
        int one = s[0];
        assertEquals(expected, one);
    }

    @Test
    public void createCatsTest(){
        try {
            assertEquals(2, Main2.createCats().size());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
