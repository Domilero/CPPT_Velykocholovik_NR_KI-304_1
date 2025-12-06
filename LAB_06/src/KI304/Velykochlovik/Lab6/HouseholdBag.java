package KI304.Velykochlovik.Lab6;

import java.util.*;

/**
 * Параметризований клас HouseholdBag, який моделює побутовий пакет.
 * @param <T> тип елементів, які реалізують інтерфейс HouseholdItem
 */
public class HouseholdBag<T extends HouseholdItem> {
    private ArrayList<T> items;

    /** Конструктор створює порожній пакет */
    public HouseholdBag() {
        items = new ArrayList<>();
    }

    /** Додає предмет у пакет */
    public void addItem(T item) {
        items.add(item);
        System.out.print("✅ Додано предмет: ");
        item.print();
    }

    /** Видаляє предмет за індексом */
    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            System.out.print("❌ Видалено предмет: ");
            items.get(index).print();
            items.remove(index);
        } else {
            System.out.println("⚠️ Невірний індекс!");
        }
    }

    /** Повертає максимальний предмет за вартістю */
    public T findMax() {
        if (items.isEmpty()) return null;
        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    /** Виводить усі предмети пакету */
    public void showAll() {
        for (T item : items) {
            item.print();
        }
    }
}
