import unittest
from main import *

class MainTest(unittest.TestCase):
	def testOlaMundo(self):
		self.assertEqual(True, olaMundo())