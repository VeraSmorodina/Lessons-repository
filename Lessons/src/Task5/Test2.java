package Task5;

import java.util.Scanner;
import java.util.logging.Logger;

public class Test2 {
    public static void main(String[] args) {
        System.out.print("Введите ваш возраст: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        Logger.getAnonymousLogger().info("log: "+age);
        assert age <= 120;
        if (age < 18) {
            System.out.println("Вы несовершеннолетний");
        } else {
            System.out.println("Вы совершеннолетний");
        }
    }
}
