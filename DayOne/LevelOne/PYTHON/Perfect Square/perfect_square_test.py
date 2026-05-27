import unittest

import perfect_square

class perfect_square_test(unittest.TestCase):

    def test_that_perfect_square_exists(self):
        array = [4, 7, 9, 10, 16, 18]
        perfect_square.get_perfect_square(array)

    def test_that_perfect_square_returns_element(self):
        array = [4, 7, 9, 10, 16, 18]
        expected = [4 , 9 , 16]
        actual = perfect_square.get_perfect_square(array)
        self.assertEqual(expected , actual)
