import math


def isprimebad(n):
    if n < 2:
        return False
    elif n == 2:
        return True
    else:
        for i in range(2, n):
            if n % i == 0:
                return False
    return True


inp = int(input("Enter a number : "))

for i in range(1, inp+1):
    print(i, "==>", isprimebad(i))
