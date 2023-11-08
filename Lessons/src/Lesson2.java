
/**
 * Задание 1.1.
 * <p>
 * Telegram
 * Класс Пользователь: имя пользователя, изображение(аватарка), номер телефона, статус активности(онлайн или офлайн).
 * Класс Сообщения: текст, вложения, время отправки, отправитель.
 * <p>
 * Ozon
 * Класс Личный кабинет: имя, изображение, номер телефона, Email, день рождения.
 * Класс Товар: категория товара, название товара, его цена, отзывы, рейтинг, характеристика и описание.
 * Класс Информация о доставке: способ получения(самовывоз из пункта по определенному адресу, курьером),
 * данные получателя, ожидаемая дата доставки, ее цена, общая цена товаров, способы оплаты,
 * применение промокода или сертификата.
 **/

//Задание 1.2.
public class Lesson2 {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Weapon weapon = new Weapon();
        Dwarf dwarf = new Dwarf();
        animals.bobcat = "Bobcat";
        animals.dog = "Dog";
        weapon.mace = "Mace";
        weapon.battleAxe = "Battle axe";
        dwarf.thoughts = "is a hardened individual";
        dwarf.skills = "Crossbowman";
        System.out.println(animals.bobcat);
        System.out.println(animals.dog);
        System.out.println(weapon.mace);
        System.out.println(weapon.battleAxe);
        System.out.println(dwarf.thoughts);
        System.out.println(weapon.battleAxe);

        //Задание 1.3.
        Weapon weapon2 = weapon; //Присваиваем переменной weapon2 ссылку на объект
        weapon.mace = "Mace2"; // обращаемся к полю mace класса Weapon через переменную weapon и записываем новое значение
        System.out.println(weapon2.mace); //при обращении к weapon2 выведется новое значение поля mace
    }
}

class Animals {
    String bobcat;
    String caveDragon;
    String dog;
    String elephant;
    String giantCheetah;
    String giantLion;
    String giganticPanda;
}

class Dwarf {
    String name;
    int age;
    String thoughts;
    String skills;

}

class Weapon {
    String flail;
    String crossbow;
    String blowgun;
    String battleAxe;
    String halberd;
    String mace;
}
