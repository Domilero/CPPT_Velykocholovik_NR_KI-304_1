# Базовий клас — Пес

from bark_module import BarkModule
from dog_brain import DogBrain
from dog_position import DogPosition


class Dog:

    def __init__(self, name, breed, age):
        self.__name = name
        self.__breed = breed
        self.__age = age
        self.__bark = BarkModule().BarkModuleSecond()
        self.brain = DogBrain()
        self.__position = DogPosition()
        print(
            f"Dog created: {self.__name}, "
            f"порода: {self.__breed}, "
            f"вік: {self.__age}"
        )

    def bark(self):
        self.__bark.bark()

    def move(self, dx, dy):
        self.__position.move(dx, dy)

    def get_name(self):
        return self.__name

    def get_breed(self):
        return self.__breed

    def get_age(self):
        return self.__age

    def think(self):
        self.brain.think()

    def up_iq(self, value):
        self.brain.increase_iq(15)
