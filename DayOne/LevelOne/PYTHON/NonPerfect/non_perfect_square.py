import math
def non_perfect(array):
    for count in range(len(array)):
        num = int(math.sqrt(array[count]))
        if (num * num != array[count]):
            array[count] = -1

    return array

