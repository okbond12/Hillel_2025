public class Person {
    // Поля класу
    private String name;
    private int age;
    private String profession;

    // Конструктор
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    public void changeProfession(String newProfession) {
        this.profession = newProfession;
    }


    public void displayInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Професія: " + profession);
        System.out.println("-------------------------");
    }


    public static void main(String[] args) {
        // Створення об'єктів
        Person person1 = new Person("Олена", 28, "Програміст");
        Person person2 = new Person("Андрій", 35, "Інженер");
        Person person3 = new Person("Марія", 42, "Вчитель");


        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();


        person2.changeProfession("Архітектор");
        System.out.println("Після зміни професії:");
        person2.displayInfo();
    }
}