var resultado = [],
	jokenpo;

resultado[jokenpo.pedra * jokenpo.papel] = jokenpo.papel;
resultado[jokenpo.pedra * jokenpo.tesoura] = jokenpo.pedra;
resultado[jokenpo.tesoura * jokenpo.papel] = jokenpo.tesoura;
resultado[jokenpo.pedra * jokenpo.lagarto] = jokenpo.pedra;
resultado[jokenpo.lagarto * jokenpo.spock] = jokenpo.lagarto;
resultado[jokenpo.spock * jokenpo.tesoura] = jokenpo.spock;
resultado[jokenpo.tesoura * jokenpo.lagarto] = jokenpo.tesoura;
resultado[jokenpo.lagarto * jokenpo.papel] = jokenpo.lagarto;
resultado[jokenpo.spock * jokenpo.papel] = jokenpo.papel;
resultado[jokenpo.spock * jokenpo.pedra] = jokenpo.spock;

jokenpo = {
	'pedra': 1,
	'papel': 3,
	'tesoura': 5,
	'lagarto': 7,
	'spock': 11,

	'joga': function (a, b) {
		'use strict';

		if (a === null || b === null) {
			throw new Error('parametro nao pode ser nulo');
		}

		if (a === b) {
			return a;
		}

		return resultado[a * b];
	}
};




module.exports = jokenpo;