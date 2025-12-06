package KI304.Velykochlovik.Lab4;

import java.util.Scanner;
import java.io.*;

import static java.lang.System.out;

/**
 * Клас-драйвер <code>EquationsApp</code> демонструє роботу з класом Equations.
 * Виконує введення значення x, обчислення виразу та запис результату у файл.
 * @author Назар
 * @version 1.0
 */
public class EquationsApp {
    public static void main(String[] args) {
        try {
            out.print("Введіть назву файлу для запису результатів: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));

            try {
                try {
                    Equations eq = new Equations();
                    out.print("Введіть X (у градусах): ");
                    int x = in.nextInt();
                    double result = eq.calculate(x);
                    fout.println("Результат: y = " + result);
                    out.println("Результат записано у файл.");
                } finally {
                    // блок finally виконається у будь-якому випадку
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {
                out.println(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            out.println("Exception reason: неправильний шлях до файлу");
        }
    }
}
