package KI304.Velykochlovik.Lab2;

import java.io.FileNotFoundException;

/**
 * Клас-драйвер <code>DogApp</code> демонструє роботу з класом Dog
 */
public class DogApp {
    public static void main(String[] args) throws FileNotFoundException {
        Dog myDog = new Dog("Рекс", 3);

        myDog.bark();
        myDog.wagTail();
        myDog.liftPaw();
        myDog.sit();
        myDog.eat("кістку");
        myDog.run();
        myDog.lieDown();
        myDog.sleep();
        myDog.stopWagging();
        myDog.closeMouth();

        myDog.dispose();
    }
}
