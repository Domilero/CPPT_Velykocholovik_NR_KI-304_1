package KI304.Velykochlovik.Lab6;

/**
 * Інтерфейс побутового предмета.
 */
public interface HouseholdItem extends Comparable<HouseholdItem> {
    double getPrice();
    void print();
}
