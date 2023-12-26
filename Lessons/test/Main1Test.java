import Task155.Main;
import Task155.Main1;
import org.junit.Test;
import static org.junit.Assert.*;


import java.io.File;
import java.util.ArrayList;

public class Main1Test {

    @Test
    public void test1() {
        String path = "/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task15/FilesAndPackages3";
        File my_fil = new File(path);
        Main1 main1 = new Main1();
        assertTrue(my_fil.exists());
        main1.delete(path);
        assertFalse(my_fil.exists());
    }

    @Test
    public void test2() {
        ArrayList<ArrayList<File>> list = Main.lists("/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task15/FilesAndPackages", ".md", true);
        int filesCount = list.get(0).size();
        int directoryCount = list.get(1).size();
        assertEquals(2, filesCount);
        assertEquals(3, directoryCount);
    }

}
