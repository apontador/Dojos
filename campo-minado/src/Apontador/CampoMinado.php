<?php

namespace Apontador;

define("BOMBA", "*");

class CampoMinado
{
	private $mapaEntrada;

	public function __construct($entrada)
	{
		$this->mapaEntrada = $entrada;
	}

	public function getMapa() 
	{
		$mapaResultado = $this->mapaEntrada;
		for($linha=0; $linha < count($this->mapaEntrada); $linha++) {
			for($coluna=0; $coluna < count($this->mapaEntrada[$linha]); $coluna++)
			{
				if ($this->mapaEntrada[$linha][$coluna] == BOMBA) {
					$this->populaAdjacentesDaBomba(&$mapaResultado, $linha, $coluna);
				}
			}
		}

		return $mapaResultado;
	}

	public function populaAdjacentesDaBomba($mapaResultado, $linha, $coluna) {
		
		if (isset($mapaResultado[$linha][$coluna + 1])) {
			$mapaResultado[$linha][$coluna + 1] = "1";
		}

		if (isset($mapaResultado[$linha][$coluna - 1])) {
			$mapaResultado[$linha][$coluna - 1] = "1";
		}
		
		if (isset($mapaResultado[$linha + 1][$coluna])) {
			$mapaResultado[$linha + 1][$coluna]   = "1";
		}
		
		if (isset($mapaResultado[$linha + 1][$coluna + 1])) {
			$mapaResultado[$linha + 1][$coluna + 1] = "1";
		}

		if (isset($mapaResultado[$linha +1][$coluna - 1])) {
			$mapaResultado[$linha + 1][$coluna - 1] = "1";
		}

		if (isset($mapaResultado[$linha - 1][$coluna])) {
			$mapaResultado[$linha - 1][$coluna]   = "1";
		}
		
		if (isset($mapaResultado[$linha - 1][$coluna + 1])) {
			$mapaResultado[$linha - 1][$coluna + 1] = "1";
		}

		if (isset($mapaResultado[$linha - 1][$coluna - 1])) {
			$mapaResultado[$linha - 1][$coluna - 1] = "1";
		}

	}
}