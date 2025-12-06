'''
Лабораторна робота №9
Варіант завдання №3: Базові класи — "Пес". Похідні класи — "Піддослідний пес"
Виконав: Великочоловік Н.Р.
Група КІ-304
'''
from experimental_dog import ExperimentalDog

# import main
# help(main)


if __name__ == "__main__":
    rex = ExperimentalDog("Рекс", "Лабрадор", 3, "Тест на слух")
    rex.bark()
    rex.move(3, 2)
    rex.think()
    rex.start_experiment()
    rex.report()
    print(f"IQ пса \"{rex.get_name()}\": {rex.brain.get_iq()}")
    rex.up_iq(15)
