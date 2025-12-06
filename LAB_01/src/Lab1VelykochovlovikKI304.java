import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab1VelykochovlovikKI304 {

    public static void main(String[] args) throws FileNotFoundException {
        File dataFile = new File("Lab1VelykochovlovikKI304.txt");

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
            char symbol1 = filler.charAt(0);
            char symbol2 = '1';

            int upperRows = n / 2 + 1;

            for (int i = 0; i < upperRows; i++) {
                for (int s = 0; s < i * 2; s++) {
                    System.out.print(" ");
                    fout.print(" ");
                }

                int count = n - i * 2;
                for (int j = 0; j < count; j++) {
                    if (j == count - 1) {
                        System.out.print(symbol2 + " ");
                        fout.print(symbol2 + " ");
                    } else {
                        System.out.print(symbol1 + " ");
                        fout.print(symbol1 + " ");
                    }
                }

                System.out.println();
                fout.println();
            }

            int remainingRows = n - upperRows;
            for (int i = 0; i < remainingRows; i++) {
                for (int s = 0; s < upperRows * 2; s++) {
                    System.out.print(" ");
                    fout.print(" ");
                }
                System.out.println();
                fout.println();
            }

            System.out.println("Результат збережено у файл " + dataFile.getName());
        }
    }
}
