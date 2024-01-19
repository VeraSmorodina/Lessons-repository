package task3;

public class Main3 {

        public static void main(String[] args) {
            Animal cat = new Animal();
            cat.name = "Барсик";
            cat.age = 2;
            cat.mass = 3;
            cat.kind = 1;
            cat.speed = 10;
            cat.catchMouses = 1;
            cat.catchMouse(2);

            Weapon weapon = new Weapon();
            weapon.name = "Граф";
            weapon.kind = 1;
            weapon.damage = 5;
            weapon.range = 6;
            weapon.increaseDamage(2);

            Dwarf dwarf = new Dwarf();
            dwarf.name = "Гора";
            dwarf.age = 30;
            dwarf.thoughts = 2;
            dwarf.skills = 0;
            dwarf.HP = 4;
            dwarf.drink = 1;
            dwarf.workId = 3;
            dwarf.drink(2);
        }
    }

    class Animal {
        String name;  //имя животного
        int age;      //возраст животного
        double mass;  //вес животного
        int kind;     //вид животного: 0-кот, 1-пёс, 2-мул
        double speed; // скорость движения, км/ч
        int catchMouses; // количество пойманных мышей

        void catchMouse(int m) {
            this.catchMouses += m;
        }
    }

    class Dwarf {
        String name; //имя
        int age;     //возраст
        int thoughts; //0 - без закалки, 1 - привыкает к трагедии, 2 - закаленный индивидуум, 3 - ничего не волнует
        int skills;   //0 - Арбалетчик, 1 - коменщик, 2 - кожевенник, 3 - переговорщик
        int HP; // здоровье, условные баллы
        double drink; // сколько выпито, литры
        int workId; // код текущей деятельности: 0-отдыхает, 1-выпивает, 2-работает, 3-сражается

        void drink(double a) {
            this.drink += a;
        }
    }

    class Weapon {
        String name; // название
        int kind; // код оружия: 1-арбалет, 2-духовое ружьё, 3-боевой топор, 4-булава;
        int damage; // сила поражения, баллы
        int range; // дальность действия для дальнобойного

        void increaseDamage(int n) {
            damage += n;
        }
}
