package KI304.Velykochlovik.Lab3;

import java.io.FileNotFoundException;

/**
 * Драйвер для демонстрації роботи підкласу ExperimentalDog.
 */
public class ExperimentalDogApp {
    public static void main(String[] args) {
        try {
            ExperimentalDog rex = new ExperimentalDog("Рекс", 3);

            rex.bark();
            rex.wagTail();
            rex.liftPaw();
            rex.sit();
            rex.eat("кістку");
            rex.run();
            rex.performTest("Стійкість до шуму");
            rex.performTest("Реакція на команду 'до мене'");
            System.out.println("Результати тестів:\n" + rex.getTestResults());
            rex.lieDown();
            rex.sleep();
            rex.stopWagging();
            rex.closeMouth();

            rex.dispose();
        } catch (FileNotFoundException e) {
            System.err.println("Не вдалося відкрити файл для логування: " + e.getMessage());
        }
    }
}
