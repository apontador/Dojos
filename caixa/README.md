#Dojo 09/05/2012

##Linguagem

**Python**

##Problema

Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletrônico. Os requisitos básicos são os seguintes:

- Entregar o menor número de notas;
- É possível sacar o valor solicitado com as notas disponíveis;
- Saldo do cliente infinito;
- Quantidade de notas infinito;
- Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00

Exemplos:

- Valor do Saque: R$ 30,00 – Resultado Esperado: Entregar 1 nota de R$20,00 1 nota de R$ 10,00.
- Valor do Saque: R$ 80,00 – Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 1 nota de R$ 10,00.


##Lista de Participantes

- Fernando
- Hugo
- Henrique
- Vitor
- Eduardo
- Marcos
- Renan
- Lucio
- Mateus
- Rafael Santos
- Renan Lordello
- Eduardo


## Setup do projeto

	git clone git@github.com:apontador/Dojos.git
	cd Dojos/caixa
	pip install -r requirements.txt


## Para rodar os testes

Na raiz do projeto (Dojos/caixa) execute o comando:

	pywatch notetests .

Isso vai fazer com que os arquivos do projeto sejam monitorados. Caso algum arquivo seja salvo, o nosetests vai rodar os testes e se exibir um alerta (Testado no Mac) com o resultado do teste.

