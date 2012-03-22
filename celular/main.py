# -*- coding: utf-8 -*-

dicionario = {
	"A":"2", 
	"B":"22", 
	"C":"222", 
	"D":"3", 
	"E":"33",
	"F":"333",
	"G":"4",
	"H":"44",
	"I":"444",
	"J":"5",
	"K":"55",
	"L":"555",
	"M":"6",
	"N":"66",
	"O":"666",
	"P":"7",
	"Q":"77",
	"R":"777",
	"S":"7777",
	"T":"8",
	"U":"88",
	"V":"888",
	"W":"9",
	"X":"99",
	"Y":"999",
	"Z":"9999",
	" ":"0"
}

def converte_sms(mensagem):
	_verifica_tamanho(mensagem)

	retorno = ""
	digito_anterior = None
	for w in mensagem:
		digito_atual = dicionario[w]
		if _eh_repeticao_de_tecla(digito_anterior, digito_atual): 
			retorno+="_"
		retorno += digito_atual
		digito_anterior = digito_atual
	return retorno

def _verifica_tamanho(mensagem):
	if len(mensagem) > 255:
		raise Exception()

def _eh_repeticao_de_tecla(anterior, atual):
	return anterior != None and anterior[0] == atual[0]