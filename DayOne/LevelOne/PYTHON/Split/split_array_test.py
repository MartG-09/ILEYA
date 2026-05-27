from unittest import TestCase

import split_array

class split_array_test(TestCase):
    
    def test_that_split_array_exists(self):
        array = [45 , 60 , 3 , 10 , 9 , 22]
        split_array.split(array)

    def test_that_split_array_returns_two_dimesional_array(self):
        array = [45 , 60 , 3 , 10 , 9 , 22]
        expected = [[60 , 10 , 22] , [45 , 3 , 9]]
        actual = split_array.split(array)
        self.assertEqual(expected , actual)
   
