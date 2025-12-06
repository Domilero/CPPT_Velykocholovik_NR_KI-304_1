# Модуль позиції пса у просторі

class DogPosition:

    def __init__(self, x=0, y=0):
        self.__x = x
        self.__y = y

    def move(self, dx, dy):
        self.__x += dx
        self.__y += dy
        print(f"Пес перемістився до координат ({self.__x}, {self.__y})")

    def get_position(self):
        return self.__x, self.__y
