package Task155;

import java.io.File;

public class Main1 {
    public void delete(String path) {
        File root = new File(path);
        if (!checkDirectory(root)){
            System.out.println("Неудача");
            return;
        }
        File[] array = root.listFiles();
        for (File file : array) {
            file.delete();
        }
        root.delete();
        System.out.println("Успешно");
    }

    public boolean checkDirectory(File file) {
        if (!file.isDirectory()){
            return false;
        }
        File[] array = file.listFiles();
        for (File file1 : array) {
            if (file1.isDirectory()){
                return false;
            }
        }
        return true;

    }
}
