package Task177;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class Main17 {
    public static void main(String[] args) throws Exception {
        changeImageFormat("jpg", "png");
    }

//    Задание 4.1
    public static void changeImageFormat(String format1, String format2) throws Exception {
        String path = "./Lessons/src/Task177";
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
