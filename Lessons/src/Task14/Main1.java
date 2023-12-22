package Task14;

import java.io.*;

public class Main1 {
    public static void main(String[] args) throws Exception {
        System.out.println(sum(1, 2, "/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/"));
    }

    public static int sum(int number1, int number2, String path) {
        int sum = 0;
        try {
            File my_fil1 = new File(path + number1 + ".txt");
            File my_fil2 = new File(path + number2 + ".txt");
            BufferedReader br1 = new BufferedReader(new FileReader(my_fil1));
            BufferedReader br2 = new BufferedReader(new FileReader(my_fil2));
            String st1 = br1.readLine();
            String st2 = br2.readLine();
            while (st1 != null) {
                sum += Integer.parseInt(st1);
                st1 = br1.readLine();
            }
            while (st2 != null) {
                sum += Integer.parseInt(st2);
                st2 = br2.readLine();
            }
            br1.close();
            br2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
}