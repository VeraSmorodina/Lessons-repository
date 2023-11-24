package Task5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        if (scanner.nextInt() < 18) {
            System.out.println("Вы несовершеннолетний");
        } else {
            System.out.println("Вы совершеннолетний");
        }
    }
}
