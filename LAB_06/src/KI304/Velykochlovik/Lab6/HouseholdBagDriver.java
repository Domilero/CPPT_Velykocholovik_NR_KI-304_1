/****************************************************************************
 * Copyright (c) 2023-2025 Lviv Polytechnic National University.
 * All Rights Reserved.
 *
 * SPDX-License-Identifier: AFL-3.0
 ****************************************************************************/

package KI304.Velykochlovik.Lab6;


/**
 * Клас-драйвер для демонстрації параметризованого класу HouseholdBag.
 * Реалізує роботу з різними побутовими предметами.
 */
public class HouseholdBagDriver {
    public static void main(String[] args) {
        // Створюємо побутовий пакет, який зберігає об’єкти HouseholdItem
        HouseholdBag<HouseholdItem> bag = new HouseholdBag<>();

        // Додаємо різні предмети
        bag.addItem(new Product("Молоко", 25.5));
        bag.addItem(new CleaningTool("Губка", 12.3));
        bag.addItem(new Product("Хліб", 18.2));
        bag.addItem(new CleaningTool("Миючий засіб", 45.8));

        // Виводимо всі предмети
        System.out.println("\n📦 Вміст пакету:");
        bag.showAll();

        // Знаходимо максимальний предмет (за ціною)
        HouseholdItem maxItem = bag.findMax();
        System.out.println("\n💰 Найдорожчий предмет:");
        maxItem.print();

        // Видаляємо предмет
        bag.removeItem(1);
        System.out.println("\n🗑️ Після видалення елемента:");
        bag.showAll();
    }
}
