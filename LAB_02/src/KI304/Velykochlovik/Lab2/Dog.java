package KI304.Velykochlovik.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Клас <code>Dog</code> реалізує сутність собаки з хвостом, лапою і мордою
 */
public class Dog {
    private Tail tail;
    private Paw paw;
    private Muzzle muzzle;
    private String name;
    private int age;
    private PrintWriter fout;

    /**
     * Конструктор за замовчуванням
     */
    public Dog() throws FileNotFoundException {
        this("Безіменний", 0);
    }

    /**
     * Конструктор з параметрами
     * @param name Ім’я собаки
     * @param age Вік собаки
     */
    public Dog(String name, int age) throws FileNotFoundException {
        this.name = name;
        this.age = age;
        this.tail = new Tail();
        this.paw = new Paw();
        this.muzzle = new Muzzle();
        fout = new PrintWriter(new File("dog_log.txt"));
    }

    /** Метод: собака гавкає */
    public void bark() {
        muzzle.open();
        fout.println(name + " гавкає: Гав-гав!");
        fout.flush();
    }

    /** Метод: собака сідає */
    public void sit() {
        paw.putDown();
        fout.println(name + " сів.");
        fout.flush();
    }

    /** Метод: собака лягає */
    public void lieDown() {
        fout.println(name + " ліг.");
        fout.flush();
    }

    /** Метод: собака махає хвостом */
    public void wagTail() {
        tail.wag();
        fout.println(name + " махає хвостом.");
        fout.flush();
    }

    /** Метод: собака перестав махати хвостом */
    public void stopWagging() {
        tail.stop();
        fout.println(name + " перестав махати хвостом.");
        fout.flush();
    }

    /** Метод: собака піднімає лапу */
    public void liftPaw() {
        paw.lift();
        fout.println(name + " підняв лапу.");
        fout.flush();
    }

    /** Метод: собака закрив пащу */
    public void closeMouth() {
        muzzle.close();
        fout.println(name + " закрив пащу.");
        fout.flush();
    }

    /** Метод: собака біжить */
    public void run() {
        fout.println(name + " весело біжить!");
        fout.flush();
    }

    /** Метод: собака їсть */
    public void eat(String food) {
        fout.println(name + " їсть " + food + ".");
        fout.flush();
    }

    /** Метод: собака спить */
    public void sleep() {
        fout.println(name + " спить.");
        fout.flush();
    }

    /** Коректне завершення роботи з файлом */
    public void dispose() {
        fout.close();
    }

    // гетери
    public String getName() { return name; }
    public int getAge() { return age; }
}