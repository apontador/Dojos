# -*- coding: utf-8 -*-
import unittest

from main import *

class MainTest(unittest.TestCase):

	def testADeveRetornar2(self):
		digitos = converte_sms("A")
		self.assertEqual("2", digitos)

	def testBDeveRetornar22(self):
		digitos = converte_sms("B")
		self.assertEqual("22", digitos)

	def testADDeveRetornar23(self):
		digitos = converte_sms("AD")
		self.assertEqual("23", digitos)

	def testABDeveRetornar2_22(self):
		digitos = converte_sms("AB")
		self.assertEqual("2_22", digitos)

	def testTemMais255Chars(self):
		string256 = "A"*256

		self.assertRaises(Exception, converte_sms, string256)

	def testTemExatamente255Chars(self):
		string255 = "A"*255
		sms = converte_sms(string255)
		self.assertEqual("_".join("2"*255), sms)

	def testDeveFuncionarAFraseDoProblema(self):
		frase =  "SEMPRE ACESSO O APONTADOR"
		sms = converte_sms(frase)
		esperado = "77773367_7773302_222337777_77776660666027666_66823666777"
		self.assertEqual(esperado, sms)

if __name__ == '__main__':
	unittest.main()
	#testADeveRetornar2()
	#testBDeveRetornar22()
	#testADDeveRetornar23()