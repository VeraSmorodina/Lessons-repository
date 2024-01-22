
```java
public class Main17 {
    public static void main(String[] args) throws Exception {
        changeImageFormat("jpg", "png");
    }

    //    Задание 4.1
    public static void changeImageFormat(String format1, String format2) throws Exception {
        String path = ".";
        File my_fil = new File(path);
        File[] array = my_fil.listFiles();
        ArrayList<String> names = new ArrayList<>();
        for (File file : array) {
            String fileName = file.getName();
            int lastIndexOfDot = fileName.lastIndexOf('.');
            if (!(lastIndexOfDot > 0 && lastIndexOfDot < fileName.length() - 1))
                continue;
            String format = fileName.substring(lastIndexOfDot + 1);
            if (format.equalsIgnoreCase(format1)) {
                String nameWithoutExtension = fileName.substring(0, lastIndexOfDot);
                names.add(nameWithoutExtension);
            }
        }
        for (String nameWithoutExtension : names) {
            File originalFile = new File(path + "/" + nameWithoutExtension + "." + format1);
            BufferedImage img = ImageIO.read(originalFile);
            if (img == null) {
                throw new Exception("The file " + originalFile.getAbsolutePath() + " could not be opened as an image.");
            }
            File result = new File(path + "/" + nameWithoutExtension + "." + format2);

//            Задание 4.2
            Graphics2D g = img.createGraphics();
            int w = 200;
            g.setColor(Color.BLACK);
            int x = (img.getWidth() - w) / 2;
            int y = (img.getHeight() - w) / 2;
            g.drawRect(x, y, w, w);
            g.setFont(new Font("Arial", Font.BOLD, 25));
            g.setColor(Color.WHITE);
            FontMetrics fm = g.getFontMetrics();
            String text1 = "Hello,";
            String text2 = "World!";

            int x1 = x + (w - fm.stringWidth(text1)) / 2;
            int y1 = y + ((w - fm.getHeight()) / 2) + fm.getAscent();
            int x2 = x + (w - fm.stringWidth(text2)) / 2;
            int y2 = y1 + fm.getHeight();

            g.drawString(text1, x1, y1);
            g.drawString(text2, x2, y2);
            g.dispose();
            ImageIO.write(img, format2, result);
        }
    }
}

//Тест
public class MainTest1 {
    @Test
    public void test1() throws Exception{
        File f = new File("/Users/skrai/Documents/Development/StudyProjects/Lessons-repository/Lessons/src/Task177/DT9VomB92dE.png");
        assertFalse(f.exists());
        Main17.changeImageFormat("jpg", "png");
        assertTrue(f.exists());
    }
}
```
Рефлексия по предыдущему:

В эталонном решении создается метод addFilesToZip,
который добавляет файлы в существующий ZIP-архив.
Этот метод принимает строку path, указывающую путь 
к ZIP-файлу, и массив объектов File,
которые нужно добавить в архив.
Далее следует создание объекта File,
который представляет собой исходный ZIP-файл по указанному пути.
Затем создается временный файл.
Если переименование файла не прошло успешно выполнится тело условия.
Создаем буфер и объект для чтения, а также объект для записи данных.
Далее идет цикл, который перебирает все файлы в массиве files.
Внутри цикла мы открываем поток чтения для каждого файла из массива.
Затем следует начало записи новой записи (элемента) в ZIP-файл для каждого добавляемого файла.
Имеется вложенный цикл для чтения данных из потока ввода и записи их в поток вывода ZIP-файла.
После которого мы закрываем текущую запись в ZIP-файле и поток чтения текущего файла.
Далее идет цикл для копирования оставшихся записей из временного ZIP.
И цикл чтения записей из временного ZIP-файла, 
в котором копируются из временного ZIP-файла в поток вывода исходного местоположения ZIP-файла.
Затем следует закрытие каждой скопированной записи и закрытие потока вывода.
Дальше идет удаление временного файла.
