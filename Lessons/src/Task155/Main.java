package Task155;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<File>> list = lists("/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task15/FilesAndPackages", ".md", true);
        for (ArrayList<File> list1 : list) {
            System.out.println("ArrayList в списке под индексом " + list.indexOf(list1));
            for (File file : list1) {
                System.out.println(file.getName());
            }
        }
    }

    public static ArrayList<ArrayList<File>> lists(String path, String expansion, boolean checkboxes) {
        ArrayList<File> filesTemporarily = new ArrayList<>();
        ArrayList<File> directoriesTemporarily = new ArrayList<>();

        ArrayList<File> filesWithExtension = new ArrayList<>();
        ArrayList<File> subdirectories = new ArrayList<>();

        ArrayList<ArrayList<File>> result = new ArrayList<>();
        File directory = new File(path);
        filesTemporarily.add(directory);

        File[] expandCopy = directory.listFiles();
        for (File file : expandCopy) {
            if (file.isDirectory()) {
                directoriesTemporarily.add(file);
                subdirectories.add(file);
            } else if (file.isFile() && file.getName().toLowerCase().endsWith(expansion)) {
                filesWithExtension.add(file);
            }
        }
        if (!checkboxes) {
            result.add(filesWithExtension);
            result.add(subdirectories);
            return result;
        }
        File[] arrayDirectories = subdirectories.toArray(new File[directoriesTemporarily.size()]);
        for (File arrayDirectory0 : arrayDirectories) {
            File[] array = arrayDirectory0.listFiles();
            for (File arrayDirectory : array) {
                if (arrayDirectory.isDirectory()) {
                    subdirectories.add(arrayDirectory);
                } else if (arrayDirectory.isFile() && arrayDirectory.getName().toLowerCase().endsWith(expansion)) {
                    filesWithExtension.add(arrayDirectory);
                }
            }
        }
        result.add(filesWithExtension);
        result.add(subdirectories);
        return result;
    }
}


//    File[] expandCopy1 = filesTemporarily.toArray(new File[filesTemporarily.size()]);
//    //        File[] expandCopy = filesTemporarily.listFiles();
//    File[] expandCopy = directory.listFiles();
//        filesTemporarily.clear();


//    File[] expandCopy = filesTemporarily.toArray(new File[filesTemporarily.size()]);
//        filesTemporarily.clear();
////        File[] expandCopy = filesTemporarily.listFiles();
//        for (File file : expandCopy) {
//            if (file.isDirectory()) {
//                directoriesTemporarily.add(file);
//                subdirectories.add(file);
//            } else if (file.isFile() && file.getName().toLowerCase().endsWith(expansion)) {
//                filesWithExtension.add(file);
//            }
//        }


//    public static void main(String[] args) {
////        System.out.println(lists("/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task15/FilesAndPackages", ".txt", false));
////        lists("/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task15/FilesAndPackages",".txt", false);
//
//        ArrayList<ArrayList<File>> list = lists("/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task15/FilesAndPackages", ".txt", true);
//        for (ArrayList<File> list1 : list) {
//            System.out.println("ArrayList в списке под индексом " + list.indexOf(list1));
//            for (File file : list1) {
//                System.out.println(file.getName());
//            }
//        }
//    }
//
//    public static ArrayList<ArrayList<File>> lists(String path, String expansion, boolean checkboxes) {
//        ArrayList<File> filesTemporarily = new ArrayList<>();
//        ArrayList<File> directoriesTemporarily = new ArrayList<>();
//
//        ArrayList<File> filesWithExtension = new ArrayList<>();
//        ArrayList<File> subdirectories = new ArrayList<>();
//
//        ArrayList<ArrayList<File>> result = new ArrayList<>();
//        File directory = new File(path);
//        filesTemporarily.add(directory);
//
//        File[] expandCopy = filesTemporarily.toArray(new File[filesTemporarily.size()]);
//        filesTemporarily.clear();
////        File[] expandCopy = filesTemporarily.listFiles();
//        for (File file : expandCopy) {
//            if (file.isDirectory()) {
//                directoriesTemporarily.add(file);
//                subdirectories.add(file);
//            } else if (file.isFile() && file.getName().toLowerCase().endsWith(expansion)) {
//                filesWithExtension.add(file);
//            }
//        }
//        if (!checkboxes) {
//            result.add(filesWithExtension);
//            result.add(subdirectories);
//            return result;
//        }
//        File[] arrayDirectories = subdirectories.toArray(new File[directoriesTemporarily.size()]);
//        for (File arrayDirectory0 : arrayDirectories) {
//            File[] array = arrayDirectory0.listFiles();
//            for (File arrayDirectory : array) {
//                if (arrayDirectory.isDirectory()) {
//                    subdirectories.add(arrayDirectory);
//                } else {
//                    filesWithExtension.add(arrayDirectory);
//                }
//            }
//        }
//        result.add(filesWithExtension);
//        result.add(subdirectories);
//        return result;
//    }
//}

//        ArrayList<File> filesTemporarily = new ArrayList<>();
////        ArrayList<File> directoriesTemporarily = new ArrayList<>();
//        ArrayList<File> filesWithExtension = new ArrayList<>();
//        ArrayList<File> subdirectories = new ArrayList<>();
//        ArrayList<ArrayList<File>> result = new ArrayList<>();
//        File directory = new File(path);
//        filesTemporarily.add(directory);
//
//        for (int i = 0; i <=1; i++) {
//            File[] expandCopy = filesTemporarily.toArray(new File[filesTemporarily.size()]);
//            filesTemporarily.clear();
//
//            for (File file : expandCopy) {
//                if (file.isDirectory()){
//                    subdirectories.add(file);
////                    filesTemporarily.add(file);
//                    filesTemporarily.addAll(Arrays.asList(file.listFiles()));
//                    ////если файл является директорией мы получаем из него файлы в виде массива и добавляем в ArrayList
//                }
//                else if (file.isFile() && file.getName().toLowerCase().endsWith(expansion)){
//                    filesWithExtension.add(file);
//                }
//        }
//            if (!checkboxes) {
//                result.add(filesWithExtension);
//                result.add(subdirectories);
//                return result;
//            }
//            result.add(filesWithExtension);
//            result.add(subdirectories);
//        }
//        return result;


//        ArrayList<File> filesTemporarily = new ArrayList<>();
//        ArrayList<File> filesWithExtension = new ArrayList<>();
//        ArrayList<File> subdirectories = new ArrayList<>();
//        ArrayList<ArrayList<File>> result = new ArrayList<>();
//        File directory = new File(path);
//        filesTemporarily.add(directory);
//
////        for (int i = 0; i <=1; i++) {
//            File[] expandCopy = filesTemporarily.toArray(new File[filesTemporarily.size()]);
//            filesTemporarily.clear();
//
//            for (File file : expandCopy) {
//                if (file.isDirectory()){
//                    subdirectories.add(file);
//                }
//                else if (file.isFile() && file.getName().toLowerCase().endsWith(expansion)){
//                    filesWithExtension.add(file);
//                }
//            }
//            if (!checkboxes) {
//                result.add(filesWithExtension);
//                result.add(subdirectories);
//                return result;
//            }
//            else {
//                for (int j = 0; j < filesTemporarily.size(); j++) {
//                    File[] d = filesTemporarily.toArray(new File[filesTemporarily.size()]);
//                    for (int k = 0; k < d.length; k++) {
//                        for (File file : expandCopy) {
//                            if (file.isDirectory()){
//                                subdirectories.add(file);
//                            }
//                            else if (file.isFile() && file.getName().toLowerCase().endsWith(expansion)){
//                                filesWithExtension.add(file);
//                    }
//                }
//
//
//            }


//            result.add(filesWithExtension);
//            result.add(subdirectories);
////        }
//        return result;
//

//
//    }
//}
//        if (directory.exists() && directory.isDirectory()){
//            List<String> filesWithExtension, List<String> subdirectories) {
//                File[] files = directory.listFiles();
//                if (files != null) {
//                    for (File file : files) {
//                        if (file.isFile() && file.getName().endsWith(extension)) {
//                            filesWithExtension.add(file.getName());
//                        } else if (file.isDirectory()) {
//                            subdirectories.add(file.getName());
//                            if (includeSubdirectories) {
//                                searchDirectory(file, extension, false, filesWithExtension, new ArrayList<>());




