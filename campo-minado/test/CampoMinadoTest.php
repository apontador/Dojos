<?php

require_once('CampoMinado.php');

class CampoMinadoTest extends PHPUnit_Framework_TestCase
{
	public function testPizza()
	{
		$campoMinado = new CampoMinado();
		$this->assertSame('pizza', $campoMinado->getPizza());
	}
}