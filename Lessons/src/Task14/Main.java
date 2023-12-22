package Task14;

import java.io.*;
import java.util.Random;

public class Main {
    public void createFiles() {
        try {
            Random random = new Random();
            for (int i = 1; i <= 10; i++) {
                File my_fil = new File(i + ".txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(my_fil));
                for (int j = 0; j < 3; j++) {
                    int randomNumber = random.nextInt(10) + 1;
                    writer.write(randomNumber + "");
                    if (j < 2)
                        writer.newLine();
                }
                writer.close();
            }
            System.out.println("Files have been created and filled with random numbers.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
