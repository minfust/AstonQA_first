import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел a и b
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравнение чисел и вывод результата
        if (a > b) {
            System.out.println("a > b");
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println("a < b");
            System.out.println(a + " < " + b);
        } else {
            System.out.println("a = b");
            System.out.println(a + " = " + b);
        }

        // Выполнение операций и вывод результатов
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно.");
        }
        System.out.println("Умножение: " + (a * b));

        scanner.close();
    }
}
