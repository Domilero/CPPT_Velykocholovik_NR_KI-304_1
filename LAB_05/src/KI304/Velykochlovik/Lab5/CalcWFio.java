package KI304.Velykochlovik.Lab5;

import java.io.*;
import java.util.Scanner;

/**
 * Клас <code>CalcWFio</code> реалізує методи запису/читання результату в текстовий та бінарний файл.
 * Працює з одиничним значенням результату (double).
 * @author Назар
 * @version 1.0
 */
public class CalcWFio {
    private double result;

    public void setResult(double r) { result = r; }
    public double getResult() { return result; }

    /**
     * Запис результату у текстовий файл (один double, формат %f).
     * @param fName ім'я файлу
     * @throws FileNotFoundException якщо файл не може бути створено
     */
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        //f.printf("%f%n", result);
        f.print(Double.toString(result));
        f.close();
    }

    /**
     * Зчитування результату з текстового файлу.
     * @param fName ім'я файлу
     * @throws FileNotFoundException якщо файл не знайдено
     */
    public void readResTxt(String fName) throws FileNotFoundException {
        File f = new File(fName);
        if (!f.exists()) throw new FileNotFoundException("File " + fName + " not found");
        Scanner s = new Scanner(f);
        if (s.hasNextDouble()) {
            result = s.nextDouble();
        } else {
            throw new IllegalStateException("File does not contain a double value");
        }
        s.close();
    }

    /**
     * Запис результату у бінарний файл (DataOutputStream).
     * @param fName ім'я файлу
     * @throws IOException при помилках вводу/виводу
     */
    public void writeResBin(String fName) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fName))) {
            dos.writeDouble(result);
        }
    }

    /**
     * Зчитування результату з бінарного файлу (DataInputStream).
     * @param fName ім'я файлу
     * @throws IOException при помилках вводу/виводу
     */
    public void readResBin(String fName) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fName))) {
            result = dis.readDouble();
        }
    }
}
