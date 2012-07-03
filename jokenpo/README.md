Dojo 03/07/2012
===============

Linguagem
---------

**Javascript** (Node.js)

Problema
--------

Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre três possíveis itens: Pedra, Papel ou Tesoura.

O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da partida.

As regras são as seguintes:

* Pedra empata com Pedra e ganha de Tesoura
* Tesoura empata com Tesoura e ganha de Papel
* Papel empata com Papel e ganha de Pedra


*Adicional*: Lagarto e Spock

* Tesoura corta papel
* Papel cobre pedra
* Pedra esmaga Lagarto
* Lagarto envenena Spock
* Spock dobra tesoura
* Tesoura decapita lagarto
* Lagarto come papel
* Papel desqualifica Spock
* Spock vaporiza pedra
* Pedra esmaga tesoura

**Original:** http://dojopuzzles.com/problemas/exibe/jokenpo/

Dependências
------------

* [Node.js](http://nodejs.org/)
* [NPM](http://npmjs.org/)
* [jasmine-node](https://github.com/mhevery/jasmine-node)

Para rodar os testes
--------------------

    jasmine-node --autotest test.spec.js
