package Task16;
import java.io.*;
import java.util.zip.*;


public class Main16 {
    public static void main(String[] args) throws IOException {
//        Вызов метода addFileInToTheArchive, который добавляет файлы из массива nameFiles в архив Test16.zip.
        addFileInToTheArchive("Test16.zip",
                new String[]{"9.txt", "10.txt"});
    }

//Определение метода addFileInToTheArchive, который принимает имя архива и массив имен файлов для добавления в архив.
    public static void addFileInToTheArchive(String nameArchive, String[] nameFiles) throws IOException {
//      Сохраняем в переменную путь к каталогу
        String url = "/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task16/";
//        Создание объекта File для представления архива ZIP.
        File zipFile = new File(url + nameArchive);
        // Создаем временный файл для временного архива
        File tempFile = File.createTempFile(zipFile.getName(), null);
        // Удаляем этот временный файл, когда программа завершает работу
        tempFile.deleteOnExit();

        // Переименовываем оригинальный архив во временный файл, конструкция вернет true если операция прошла успешно
        boolean renameOk = zipFile.renameTo(tempFile);
//        Если переименование не удалось, выбрасывается исключение IOException.
        if (!renameOk) {
            throw new IOException("Could not rename the file " + zipFile.getAbsolutePath() + " to " + tempFile.getAbsolutePath());
        }
//        Создем буфер для чтения данных из файлов
        byte[] buf = new byte[1024];
//        Создаем поток ввода ZipInputStream для чтения данных из временного файла архива.
        ZipInputStream zin = new ZipInputStream(new FileInputStream(tempFile));
//        Создаем поток вывода ZipOutputStream для записи данных в новый архив.
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));
//        Читаем следующий элемент из временного архива.
        ZipEntry entry = zin.getNextEntry();
//        Копируем содержимое из старого архива в новый
//        Цикл продолжается до тех пор, пока есть элементы в архиве.
        while (entry != null) {
//            Получение имени текущего элемента архива.
            String name = entry.getName();
//            Добавляем новый элемент в новый архив.
            out.putNextEntry(new ZipEntry(name));
//            Читаем данные из временного файла и записываем их в новый архив.
            int len;
            while ((len = zin.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
//            Закрытие текущего элемента (ZipEntry) в обоих потоках (чтения и записи).
            out.closeEntry();
            zin.closeEntry();
//            Переходим к следующему элементу во временном файле архива.
            entry = zin.getNextEntry();
        }
        // Закрываем потоки чтения из временного файла
        zin.close();
//        Добавляем новые файлы в архив
//        Цикл пробегается по всем именам файлов, которые нужно добавить в архив.
        for (String file : nameFiles) {
//            Создаем поток ввода InputStream для чтения содержимого файла, который нужно добавить.
            InputStream in = new FileInputStream(url + file);
//            Добавляем новый элемент (файл) в новый архив.
            out.putNextEntry(new ZipEntry(file));
//            Читаем содержимое файла и записываем его в новый архив.
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
//            Закрытие текущего элемента (ZipEntry) и потока ввода файла после его добавления в архив.
            out.closeEntry();
            in.close();
        }
        // Закрываем поток записи в новый архив
        out.close();
    }
}