import java.util.Scanner;

public class StudentGrade {

    public static String getGrade(int grade) {
        switch (grade) {
            case 5:
                return "Відмінно";
            case 4:
                return "Добре";
            case 3:
                return "Задовільно";
            case 2:
                return "Незадовільно";
            case 1:
                return "Погано";
            default:
                return "Неправильна оцінка";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть оцінку (1-5): ");
        int grade = scanner.nextInt();
        scanner.close();


        System.out.println(getGrade(grade));
    }
}