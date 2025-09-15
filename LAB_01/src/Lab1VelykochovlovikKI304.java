import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Клас Lab1VelykochovlovikKI304 реалізує програму
 * для генерації зубчатого масиву згідно з 3-м варіантом.
 *
 * @author ...
 * @version 1.0
 */
public class Lab1VelykochovlovikKI304 {

    public static void main(String[] args) throws FileNotFoundException {
        File dataFile = new File("Lab1VelykochovlovikKI304.txt");

        // try-with-resources — автоматично закриє in та fout
        try (Scanner in = new Scanner(System.in);
             PrintWriter fout = new PrintWriter(dataFile)) {

            System.out.print("Введіть розмір квадратної матриці: ");
            if (!in.hasNextInt()) {
                System.out.println("Невірний ввід розміру.");
                return;
            }
            int n = in.nextInt();
            in.nextLine();

            System.out.print("Введіть символ-заповнювач: ");
            String filler = in.nextLine();
            if (filler.length() != 1) {
                System.out.println("Помилка: потрібно ввести один символ!");
                return;
            }
            char symbol = filler.charAt(0);

            for (int i = 0; i < n / 2 + 1; i++) {
                for (int s = 0; s < i * 2; s++) {
                    System.out.print(" ");
                    fout.print(" ");
                }
                int count = n - i * 2;
                for (int j = 0; j < count; j++) {
                    System.out.print(symbol + " ");
                    fout.print(symbol + " ");
                }
                System.out.println();
                fout.println();
            }

            System.out.println("Результат збережено у файл " + dataFile.getName());
        }
    }
}
