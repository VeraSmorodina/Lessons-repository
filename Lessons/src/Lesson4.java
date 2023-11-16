/**
 * Методы в классах следовало сделать публичными и добавить в них проверки.
 */

public class Lesson4 {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", 2, 3, 1, 10);
        Weapon weapon = new Weapon("Граф", 1, 5, 6);
        Dwarf dwarf = new Dwarf("Гора", 30, 2, 0, 4, 1.1, 3);
    }
}

class Animal {
    private String name;  //имя животного
    private int age;      //возраст животного
    private double mass;  //вес животного
    private int kind;     //вид животного: 0-кот, 1-пёс, 2-выдра
    private double speed; // скорость движения, км/ч
    private int catchMouses; // количество пойманных мышей, если выбран кот

    public void catchMouse(int m) {
        this.catchMouses += m;
    }

    public Animal(String name, int age, double mass, int kind, double speed) {
        this.name = name;
        this.age = age;
        this.mass = mass;
        this.kind = kind;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            this.age = 0;
        else if (age > 16)
            this.age = 16;
        else this.age = age;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        if (mass <= 0)
            this.mass = 0.5;
        else if (mass > 30)
            this.mass = 30;
        else this.mass = mass;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        if (kind < 0)
            this.kind = 0;
        else if (kind > 2)
            this.kind = 2;
        else this.kind = kind;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed < 0.0)
            this.speed = 0.0;
        else if (speed > 15)
            this.speed = 15.0;
        else this.speed = speed;
    }

    public int getCatchMouses() {
        return catchMouses;
    }

    public void setCatchMouses(int catchMouses) {
        if (catchMouses < 0)
            this.catchMouses = 0;
        else if (catchMouses > 12)
            this.catchMouses = 12;
        else this.catchMouses = catchMouses;
    }


}


class Dwarf {
    private String name; //имя
    private int age;     //возраст
    private int thoughts; //0 - без закалки, 1 - привыкает к трагедии, 2 - закаленный индивидуум, 3 - ничего не волнует
    private int skills;   //0 - Арбалетчик, 1 - коменщик, 2 - кожевенник, 3 - переговорщик
    private int HP; // здоровье, условные баллы
    private double drink; // сколько выпито, литры
    private int workId; // код текущей деятельности: 0-отдыхает, 1-выпивает, 2-работает, 3-сражается

    public void drink(double a) {
        this.drink += a;
    }


    public Dwarf(String name, int age, int thoughts, int skills, int HP, double drink, int workId) {
        this.name = name;
        this.age = age;
        this.thoughts = thoughts;
        this.skills = skills;
        this.HP = HP;
        this.drink = drink;
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            this.age = 0;
        else if (age > 100)
            this.age = 100;
        else this.age = age;
    }

    public int getThoughts() {
        return thoughts;
    }

    public void setThoughts(int thoughts) {
        if (thoughts < 0)
            this.thoughts = 0;
        else if (thoughts > 3)
            this.thoughts = 3;
        else this.thoughts = thoughts;
    }

    public int getSkills() {
        return skills;
    }

    public void setSkills(int skills) {
        if (skills < 0)
            this.skills = 0;
        else if (skills > 3)
            this.skills = 3;
        else this.skills = skills;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        if (HP < 0)
            this.HP = 0;
        else if (HP > 10)
            this.HP = 10;
        else this.HP = HP;
    }

    public double getDrink() {
        return drink;
    }

    public void setDrink(double drink) {
        if (drink < 0)
            this.drink = 0;
        else if (drink > 3)
            this.drink = 3;
        else this.drink = drink;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        if (workId < 0)
            this.workId = 0;
        else if (workId > 3)
            this.workId = 3;
        else this.workId = workId;
    }
}

class Weapon {
    private String name; // название
    private int kind; // код оружия: 0-арбалет, 1-духовое ружьё, 2-боевой топор, 3-булава;
    private int damage; // сила поражения, баллы
    private int range; // дальность действия для дальнобойного

    public void increaseDamage(int n) {
        damage += n;
    }

    public Weapon(String name, int kind, int damage, int range) {
        this.name = name;
        this.kind = kind;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        if (kind < 0)
            this.kind = 0;
        else if (kind > 3)
            this.kind = 3;
        else this.kind = kind;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0)
            this.damage = 0;
        else if (damage > 50)
            this.damage = 50;
        else this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        if (range < 0)
            this.range = 0;
        else if (range > 20)
            this.range = 20;
        else this.range = range;
    }
}

class Otter extends Animal {
    protected int swim;

    void swim(int speed) {
        setSpeed(speed);
    }

    Otter(String n, int a, double m, int k, double spd, int sw) {
        super(n, a, m, k, spd);
        this.swim = sw;
    }
}