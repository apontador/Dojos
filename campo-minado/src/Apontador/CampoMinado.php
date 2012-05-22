<?php

namespace Apontador;

define("BOMBA", "*");

class CampoMinado
{
	private $mapa;

	public function __construct($entrada)
	{
		$this->mapa = $entrada;
	}

	public function getMapa() 
	{
		for($linha=0; $linha < count($this->mapa); $linha++) {
			for($coluna=0; $coluna < count($this->mapa[$linha]); $coluna++)
			{
				if ($this->mapa[$linha][$coluna] == BOMBA) {
					$this->populaAdjacentesDaBomba($linha, $coluna);
				}
			}
		}

		return $this->mapa;
	}

	public function populaPosicao($linha, $coluna)
	{
		if (isset($this->mapa[$linha][$coluna])) {
			$this->mapa[$linha][$coluna] = "1";
		}
	}

	public function populaAdjacentesDaBomba($linha, $coluna)
	{
		$this->populaPosicao($linha, $coluna + 1);
		$this->populaPosicao($linha, $coluna - 1);
		
		$this->populaPosicao($linha + 1, $coluna - 1);
		$this->populaPosicao($linha + 1, $coluna);
		$this->populaPosicao($linha + 1, $coluna + 1);

		$this->populaPosicao($linha - 1, $coluna - 1);
		$this->populaPosicao($linha - 1, $coluna);
		$this->populaPosicao($linha - 1, $coluna + 1);
	}
}