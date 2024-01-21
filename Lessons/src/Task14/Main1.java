package Task14;

import java.io.*;
import java.util.ArrayList;

public class Main1 {
    private static final int FILE_NOT_FOUND_EXCEPTION = 1;
    private static final int IO_EXCEPTION = 2;
    private static final int NUMBER_FORMAT_EXCEPTION = 3;
    private static final int EXCEPTION = 4;

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> files = new ArrayList<>();
        files.add(1);
        files.add(2);
        files.add(3);
        Integer[] res = sum(files, "/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/");
    }

    public static Integer[] sum(ArrayList<Integer> array, String path) {
        Integer[] result = new Integer[2];
        result[1] = 0;
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
        } catch (FileNotFoundException e) {
            result[1] = 1;
        } catch (IOException e) {
            result[1] = 2;
        } catch (NumberFormatException e) {
            result[1] = 3;
        } catch (Exception e) {
            result[1] = 4;
        }
        result[0] = sum;
        return result;
    }
}