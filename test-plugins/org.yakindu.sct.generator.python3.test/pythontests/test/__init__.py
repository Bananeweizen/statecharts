from .test_example import ExampleTests
import unittest


class ExampleTests2(unittest.TestCase):
    def test_successful(self):
        self.assertEqual(3, 3)

    def test_fail(self):
        self.assertEqual(3, 4)
