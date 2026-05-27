import unittest

import palindrome_array

class palindrome_array_test(unittest.TestCase):

    def test_that_palindrome_array_exists(self):
        array = [45, 0, 8, 0, 45]
        palindrome_array.is_palindrome(array)

    def test_that_palindrome_array_returns_True(self):
        array = [45, 0, 8, 0, 45]
        expected = True
        actual = palindrome_array.is_palindrome(array)
        self.assertEqual(expected , actual)

    def test_that_palindrome_array_returns_False(self):
        array = [45, 9, 8, 0, 8]
        expected = False
        actual = palindrome_array.is_palindrome(array)
        self.assertEqual(expected , actual)
