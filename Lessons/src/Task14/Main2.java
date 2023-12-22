package Task14;

import com.sun.source.tree.BreakTree;

import java.io.*;
import java.util.ArrayList;

public class Main2 {
    public static ArrayList<Cat> createCats() throws Exception {
        File my_fil = new File("/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/out/11.text");
        BufferedWriter bw = new BufferedWriter(new FileWriter(my_fil));
        BufferedReader br = new BufferedReader(new FileReader(my_fil));
        ArrayList<Cat> cats = new ArrayList<>();
        try {
            bw.write("Барсик 4.1 64.1");
            bw.newLine();
            bw.write("Персик 3.5 70.1");
//            bw.newLine();
//            bw.write("Тиша три 70.0"); //некоректный ввод
            bw.close();
            String[] s1 = br.readLine().split(" ");
            while (s1 != null) {
                double x = Double.parseDouble(s1[1]);
                double y = Double.parseDouble(s1[2]);
                Cat cat = new Cat(s1[0], x, y);
                cats.add(cat);
                String v = br.readLine();
                if (v != null) {
                    s1 = v.split(" ");
                    continue;
                }
                s1 = null;
            }

            for (int i = 0; i < cats.size(); i++) {
                System.out.println(cats.get(i).name);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Недостаточно данных!");
        }
        catch (NumberFormatException e){
            System.out.println("Файл содержит неверные данные!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            br.close();
        }
        return cats;
    }
}

class Cat {
    public String name;
    public double mass;
    public double purr;

    Cat(String name, double mass, double purr) {
        this.name = name;
        this.mass = mass;
        this.purr = purr;
    }
}
