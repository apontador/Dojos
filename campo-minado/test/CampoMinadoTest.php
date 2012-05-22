<?php

use Apontador\CampoMinado;

class CampoMinadoTest extends PHPUnit_Framework_TestCase
{
	public function testUmaBomba()
	{
		$entrada = array(
				array("*", "0", "0","0"),
				array("0", "0", "0","0"),
				array("0", "0", "0","0"),
				array("0", "0", "0","0"),
			);
		$campoMinado = new CampoMinado($entrada);

		$esperado = array(
				array("*", "1", "0", "0"),
				array("1", "1", "0", "0"),
				array("0", "0", "0", "0"),
				array("0", "0", "0", "0"),
			);

		$this->assertSame($esperado, $campoMinado->getMapa());

	}

	public function test1x1ComBomba()
	{
		$entrada = array(
				array("*"),
				
			);
		$campoMinado = new CampoMinado($entrada);

		$esperado = array(
				array("*"),
				
			);

		$this->assertSame($esperado, $campoMinado->getMapa());
	}

	public function test1x1SemBomba()
	{
		$entrada = array(
				array("0"),
			);
		$campoMinado = new CampoMinado($entrada);

		$esperado = array(
				array("0"),
			);

		$this->assertSame($esperado, $campoMinado->getMapa());
	}

	public function test2x2SemBomba()
	{
		$entrada = array(
				array("0", "0"),
				array("0", "0")
			);
		$campoMinado = new CampoMinado($entrada);

		$esperado = array(
				array("0", "0"),
				array("0", "0"),
			);
		$this->assertSame($esperado, $campoMinado->getMapa());
	}

	public function test2x2Com1Bomba()
	{
		$entrada = array(
				array("*", "0"),
				array("0", "0")
			);
		$campoMinado = new CampoMinado($entrada);

		$esperado = array(
				array("*", "1"),
				array("1", "1"),
			);
		$this->assertSame($esperado, $campoMinado->getMapa());
	}

	public function test2x2Com1BombaADireitaSuperior()
	{
		$entrada = array(
				array("0", "*"),
				array("0", "0")
			);
		$campoMinado = new CampoMinado($entrada);

		$esperado = array(
				array("1", "*"),
				array("1", "1"),
			);
		$this->assertSame($esperado, $campoMinado->getMapa());
	}

	public function test2x2Com1BombaADireitaInferior()
	{
		$entrada = array(
				array("0", "0"),
				array("0", "*")
			);
		$campoMinado = new CampoMinado($entrada);

		$esperado = array(
				array("1", "1"),
				array("1", "*"),
			);
		$this->assertSame($esperado, $campoMinado->getMapa());
	}

	public function test2x2Com1BombaAEsquerdaInferior()
	{
		$entrada = array(
				array("0", "0"),
				array("*", "0")
			);
		$campoMinado = new CampoMinado($entrada);

		$esperado = array(
				array("1", "1"),
				array("*", "1"),
			);
		$this->assertSame($esperado, $campoMinado->getMapa());
	}


}