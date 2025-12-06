# """
# Модуль Lab7: будує матрицю заданого формату.
# Автор: Великочоловік Н.Р.
# Група: КІ-304
# """
# import main
# help(main)
# Користувач вводить розмір матриці
matrix_size = int(input("Введіть розмір матриці: "))

# Користувач вводить символ-заповнювач
symbol = input("Введіть символ заповнювач: ")
# Перевірка чи користувач ввів один символ
if len(symbol) != 1:
    print("Введіть 1 символ")
    exit()

# Ініціалізація змінної для подальшої роботи з нею
text = ""
for i in range(0, matrix_size):
    for j in range(0, matrix_size - i):
        if j < i:
            s = " "
        else:
            s = symbol
        text += f"{s}  "

    # Якщо наступний рядок це центр матриці то вийти з циклу
    if i + 1 == ((matrix_size + 1) // 2):
        text += " "
    if i + 1 == matrix_size:
        break
    text += "\n"

# Вивід матриці
print(text)
