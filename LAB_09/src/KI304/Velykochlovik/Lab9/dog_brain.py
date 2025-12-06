# Модуль моделює "мозок" пса — його рівень розуміння команд

class DogBrain:

    def __init__(self, iq=50):
        self.__iq = iq

    def increase_iq(self, value):
        """Підвищити інтелект пса"""
        self.__iq += value
        print(f"Рівень IQ пса зріс до {self.__iq}")

    def get_iq(self):
        return self.__iq

    def think(self):
        """Пес думає..."""
        print("Пес задумався 🐶💭")
