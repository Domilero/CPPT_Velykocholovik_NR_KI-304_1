# Модуль відповідає за гавкіт пса

class BarkModule:
    class BarkModuleSecond:
        def __init__(self, volume=5):
            self.__volume = volume  # від 1 до 10

        def bark(self):
            print("Гав-гав! " + "🔊" * self.__volume)

        def set_volume(self, volume):
            self.__volume = max(1, min(10, volume))
