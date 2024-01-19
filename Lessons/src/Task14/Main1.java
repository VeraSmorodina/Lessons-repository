package Task14;

import java.io.*;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> files = new ArrayList<>();
        files.add(1);
        files.add(2);
        files.add(3);
        System.out.println(sum(files, "/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/"));
    }

    public static int sum(ArrayList<Integer> array, String path) {
        int sum = 0;
        try {
            for (Integer integer : array) {
                File myFil1 = new File(path + integer + ".txt");
                BufferedReader br1 = new BufferedReader(new FileReader(myFil1));
                String st1 = br1.readLine();
                while (st1 != null) {
                    sum += Integer.parseInt(st1);
                    st1 = br1.readLine();
                }
                br1.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
}