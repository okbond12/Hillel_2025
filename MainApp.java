// Enum для професій
enum Profession {
    PROGRAMMER,
    ENGINEER,
    TEACHER,
    ARCHITECT,
    DOCTOR,
    DESIGNER
}

// Абстрактний клас Person
abstract class Person {
    private String name;
    private int age;
    private Profession role;

    public Person(String name, int age, Profession role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Profession getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(Profession role) {
        this.role = role;
    }

    // Абстрактний метод, який має реалізовуватись у підкласах
    public abstract void display();

    // Перевизначуваний метод
    public void changeProfession(Profession newRole) {
        this.role = newRole;
    }

    // Перевантажений метод
    public void changeProfession(String newRoleStr) {
        try {
            Profession newRole = Profession.valueOf(newRoleStr.toUpperCase());
            this.role = newRole;
        } catch (IllegalArgumentException e) {
            System.out.println("Невідома професія: " + newRoleStr);
        }
    }
}

// Клас Man
class Man extends Person {
    public static final String GENDER = "Чоловік";

    public Man(String name, int age, Profession role) {
        super(name, age, role);
    }

    @Override
    public void display() {
        System.out.println("Стать: " + GENDER);
        System.out.println("Ім'я: " + getName());
        System.out.println("Вік: " + getAge());
        System.out.println("Професія: " + getRole());
        System.out.println("-------------------------");
    }
}

// Клас Woman
class Woman extends Person {
    public static final String GENDER = "Жінка";

    public Woman(String name, int age, Profession role) {
        super(name, age, role);
    }

    @Override
    public void display() {
        System.out.println("Стать: " + GENDER);
        System.out.println("Ім'я: " + getName());
        System.out.println("Вік: " + getAge());
        System.out.println("Професія: " + getRole());
        System.out.println("-------------------------");
    }
}

// Основний клас
public class MainApp {
    public static void main(String[] args) {
        Man man1 = new Man("Андрій", 35, Profession.ENGINEER);
        Woman woman1 = new Woman("Олена", 28, Profession.PROGRAMMER);
        Woman woman2 = new Woman("Марія", 42, Profession.TEACHER);

        man1.display();
        woman1.display();
        woman2.display();

        System.out.println("Зміна професії Марії...");
        woman2.changeProfession("ARCHITECT"); // використано перевантаження
        woman2.display();
    }
}