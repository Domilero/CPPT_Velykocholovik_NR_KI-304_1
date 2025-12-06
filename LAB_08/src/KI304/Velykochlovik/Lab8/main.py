# '''
# Лабораторна робота №8
# Варіант завдання №3: y=sin(x)/cos(x)
# Виконав: Великочоловік Н.Р.
# Група КІ-304
# '''
# import main
# help(main)
from pathlib import Path
import struct
import math
import sys


def write_text_result(filename, value):
    Path(filename).write_text(str(value))


def read_text_result(filename):
    file_path = Path(filename)
    if not file_path.exists():
        print(f"Error: file {filename} not found.")
        return 0.0
    return file_path.read_text()


def write_binary_result(filename, value):
    with open(filename, "wb") as f:
        f.write(struct.pack("d", value))


def read_binary_result(filename):
    file_path = Path(filename)
    if not file_path.exists():
        print(f"Error: file {filename} not found.")
        return 0.0
    with open(file_path, "rb") as f:
        return struct.unpack("d", f.read())[0]


def calculate_expression(x):
    return (math.sin(x))/(math.cos(x))


def main():
    txt_path = Path("textRes.txt")
    bin_path = Path("binRes.bin")

    try:
        x = float(input("Enter a number: "))
    except ValueError:
        print("Invalid input.")
        sys.exit(1)

    result = calculate_expression(x)
    print(f"Calculated result: {result}")

    write_text_result(txt_path, result)
    write_binary_result(bin_path, result)

    print("Read from binary file:", read_binary_result(bin_path))
    print("Read from text file:", read_text_result(txt_path))


if __name__ == "__main__":
    main()
