Решение 4.1
```java
public class Main {
    public static void main(String[] args) {
        File root = new File(".");//Создаем объект текущей директории
        ArrayList<File> expand = new ArrayList<File>();// создаем  ArrayList, который будет хранить файлы
        expand.add(root);// Добавляем в ArrayList ссылку на объект

        //далее следует цикл до глубины вложенности 10
        for(int depth = 0; depth < 10; depth++) {
            File[] expandCopy = expand.toArray(new File[expand.size()]);//получаем из ArrayList объекты в виде массива и записываем в переменную типа File
            expand.clear();//удаляем все из ArrayList
            for (File file : expandCopy) {// получаем все файлы из массива перебором
                System.out.println(depth + " " + file);//печатаем их
                if (file.isDirectory()) {//если файл является директорией мы получаем из него файлы в виде массива и добавляем в ArrayList
                    expand.addAll(Arrays.asList(file.listFiles()));
                }
            }
        }
    }
}
```
Задание 4.2
```java
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
```
Задание 4.3
```java
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
```

Тесты к двум последним заданиям

```java
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
```

Рефлексия по предыдущему:

Задание 3.1 аналогичное, единственное, решила выполнять newLine() в случае, если это непоследняя строка.

В задании 3.2 можно было избежать бессмысленного повторения кода, вынеся подсчет суммы чисел в
пределах одного файла в метод. И это решило бы проблему с использованием двух потоков.

Задание 3.3. похожее.

