package KI304.Velykochlovik.Lab5;

import java.util.Scanner;
import java.io.*;

/**
 * Клас-драйвер <code>Lab5App</code> демонструє роботу з класами Equations та CalcWFio.
 * Виконує введення значення x, обчислення виразу, запис у текстовий/бінарний та читання назад.
 * @author Назар
 * @version 1.0
 */
public class Lab5App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Equations eq = new Equations();
        CalcWFio fio = new CalcWFio();

        try {
            System.out.print("Введіть X (у градусах): ");
            double x = in.nextDouble();
            double result = eq.calculate(x);
            fio.setResult(result);
            System.out.println("Результат обчислення: y = " + result);

            String txtFile = "result.txt";
            String binFile = "result.bin";

            // запис
            fio.writeResTxt(txtFile);
            fio.writeResBin(binFile);
            System.out.println("Результат записано у файли: " + txtFile + ", " + binFile);

            // зчитування назад (демонстрація)
            CalcWFio fio2 = new CalcWFio();
            fio2.readResTxt(txtFile);
            System.out.println("Зчитано з текстового файлу: y = " + fio2.getResult());

            fio2.readResBin(binFile);
            System.out.println("Зчитано з бінарного файлу: y = " + fio2.getResult());

        } catch (CalcException ex) {
            System.out.println("CalcException: " + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected exception: " + ex.getMessage());
        } finally {
            in.close();
        }
    }
}
