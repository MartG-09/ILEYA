import math
def get_perfect_square(array):
    newArray = []

    for count in array:
        num = int(math.sqrt(count))

        if(num * num == count):
            newArray.append(count)

    return newArray

