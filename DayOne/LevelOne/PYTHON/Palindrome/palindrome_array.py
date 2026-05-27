def is_palindrome(array):
    num = len(array) // 2
    for count in range(num):
        if (array[count] != array[len(array) - 1 - count]):
            return False

    return True

