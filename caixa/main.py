def saque(valor):
    retorno = "Entregar"

    nota100 = int(valor /100)
    valor = valor % 100
    nota50 = int(valor / 50)
    valor = valor % 50
    nota20 = int(valor / 20)
    valor = valor % 20
    nota10 = int(valor / 10)
    valor = valor % 10

    if (nota100 > 0):
        retorno += " " + str(nota100) + " nota de R$ 100,00"

    if (nota50 > 0):
        retorno += " " + str(nota50) + " nota de R$ 50,00"

    if (nota20 > 0):
        retorno += " " + str(nota20) + " nota de R$ 20,00"

    if (nota10 > 0):
        retorno += " " + str(nota10) + " nota de R$ 10,00"

    return retorno
