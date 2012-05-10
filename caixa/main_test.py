import unittest
from main import *

class MainTest(unittest.TestCase):
    def testSaque10Reais(self):
        self.assertEqual("Entregar 1 nota de R$ 10,00", saque(10))

    def testSaque20Reais(self):
        self.assertEqual("Entregar 1 nota de R$ 20,00", saque(20))

    def testSaque50Reais(self):
        self.assertEqual("Entregar 1 nota de R$ 50,00", saque(50))

    def	testSaque100Reais(self):
        self.assertEqual("Entregar 1 nota de R$ 100,00", saque(100))

    def testSaque30Reais(self):
        self.assertEqual("Entregar 1 nota de R$ 20,00 1 nota de R$ 10,00", saque(30))

    def testSaque80Reais(self):
        self.assertEqual("Entregar 1 nota de R$ 50,00 1 nota de R$ 20,00 1 nota de R$ 10,00", saque(80))
