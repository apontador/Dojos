var jokenpo = require("./main");

describe("Jokenpo", function () {
   it("deve ter o número 1 como a pedra", function () {
   		expect(jokenpo.pedra).toEqual(1);
   });

   it("deve ter o número 3 como papel", function () {
   		expect(jokenpo.papel).toEqual(3);
   });

   it("deve ter o número 5 como tesoura", function () {
   		expect(jokenpo.tesoura).toEqual(5);
   });

   it("deve ter o número 7 como lagarto", function () {
   		expect(jokenpo.lagarto).toEqual(7);
   });

   it("deve ter o número 11 como spock", function () {
   		expect(jokenpo.spock).toEqual(11);
   });

   it("pedra deve ganhar de tesoura", function () {
   		expect(jokenpo.joga(
   			jokenpo.pedra,
   			jokenpo.tesoura
   		)).toEqual(jokenpo.pedra);
   });

   it('papel ganha de pedra', function() {
   		expect(jokenpo.joga(
   			jokenpo.papel,
   			jokenpo.pedra
   		)).toEqual(jokenpo.papel);
	});

	it('tesoura ganha de papel', function() {
   		expect(jokenpo.joga(
   			jokenpo.tesoura,
   			jokenpo.papel
   		)).toEqual(jokenpo.tesoura);
	});

	it('tesoura deve perder de pedra', function(){
   		expect(jokenpo.joga(
   			jokenpo.tesoura,
   			jokenpo.pedra
   			)).toEqual(jokenpo.pedra);
	});


	it('pedra deve perder de papel', function(){
   		expect(jokenpo.joga(
   			jokenpo.pedra,
   			jokenpo.papel
   			)).toEqual(jokenpo.papel);
	});

	it('papel deve perder de tesoura', function() {
   		expect(jokenpo.joga(
   			jokenpo.papel,
   			jokenpo.tesoura
   		)).toEqual(jokenpo.tesoura);
	});

	it('papel deve empatar com papel', function() {
   		expect(jokenpo.joga(
   			jokenpo.papel,
   			jokenpo.papel
   		)).toEqual(jokenpo.papel);
	});

	it('tesoura deve empatar com tesoura', function() {
   		expect(jokenpo.joga(
   			jokenpo.tesoura,
   			jokenpo.tesoura
   		)).toEqual(jokenpo.tesoura);
	});
	
	it('pedra deve empatar com pedra', function() {
   		expect(jokenpo.joga(
   			jokenpo.pedra,
   			jokenpo.pedra
   		)).toEqual(jokenpo.pedra);
	});


	it('spock deve dobrar tesoura', function() {
   		expect(jokenpo.joga(
   			jokenpo.spock,
   			jokenpo.tesoura
   		)).toEqual(jokenpo.spock);
	});	

	it('parametro null deve retornar excecao', function() {
   		expect(function() {
   			jokenpo.joga(
   			null,
   			jokenpo.pedra)
   		}).toThrow(new Error("parametro nao pode ser nulo"));
	});

	it('pedra esmaga lagarto', function() {
   		expect(jokenpo.joga(
   			jokenpo.pedra,
   			jokenpo.lagarto
   		)).toEqual(jokenpo.pedra);
	});

	it('lagarto envenena spock', function() {
   		expect(jokenpo.joga(
   			jokenpo.lagarto,
   			jokenpo.spock
   		)).toEqual(jokenpo.lagarto);
	});

	it('Tesoura deve decapitar lagarto', function() {
   		expect(jokenpo.joga(
   			jokenpo.tesoura,
   			jokenpo.lagarto
   		)).toEqual(jokenpo.tesoura);
	});


	it('Lagarto come papel', function() {
   		expect(jokenpo.joga(
   			jokenpo.lagarto,
   			jokenpo.papel
   		)).toEqual(jokenpo.lagarto);
	}); 

	it('Papel desqualifica Spock', function() {
   		expect(jokenpo.joga(
   			jokenpo.papel,
   			jokenpo.spock
   		)).toEqual(jokenpo.papel);
	});	
  
  	it('Spock vaporiza pedra', function() {
   		expect(jokenpo.joga(
   			jokenpo.spock,
   			jokenpo.pedra
   		)).toEqual(jokenpo.spock);
	});

	it('Pedra é vaporizada por Spock', function() {
   		expect(jokenpo.joga(
   			jokenpo.pedra,
   			jokenpo.spock
   		)).toEqual(jokenpo.spock);
	});

}); 
 