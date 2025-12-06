# Похідний клас — Піддослідний пес

from dog import Dog


class ExperimentalDog(Dog):

    def __init__(self, name, breed, age, experiment_type):
        super().__init__(name, breed, age)
        self.__experiment_type = experiment_type
        self.__result = None
        print(f"Експеримент: {self.__experiment_type}")

    def start_experiment(self):
        print(
            f"Пес {self.get_name()} бере участь у досліді"
            f" {self.__experiment_type}'..."
        )
        self.__result = "успішно"
        print("Дослід пройшов успішно ✅")

    def report(self):
        print(
            f"Експеримент '{self.__experiment_type}'"
            f" завершено {self.__result}.''')"
        )
