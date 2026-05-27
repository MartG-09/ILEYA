import unittest

import non_perfect_square

class non_perfect_square_test(unittest.TestCase):

    def test_that_non_perfect_square_exists(self):
        array = [4, 7, 9, 10, 49, 6]
        non_perfect_square.non_perfect(array)

    def test_that_non_perfect_square_returns_element(self):
        array = [4, 7, 9, 10, 49, 6]
        expected = [4, -1, 9, -1, 49, -1]
        actual = non_perfect_square.non_perfect(array)
        self.assertEqual(expected , actual)
