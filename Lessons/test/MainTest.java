import Task14.Main;
import Task14.Main1;
import Task14.Main2;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.File;

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
        int s = Main1.sum(1,2, "/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/");
        int expected = 39;
        assertEquals(expected, s);
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
