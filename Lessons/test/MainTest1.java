import java.io.File;

import Task177.Main17;
import org.junit.*;
import static org.junit.Assert.*;


public class MainTest1 {
    @Test
    public void test1() throws Exception{
        File f = new File("/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task177/DT9VomB92dE.png");
        assertFalse(f.exists());
        Main17.changeImageFormat("jpg", "png");
        assertTrue(f.exists());
    }
}
