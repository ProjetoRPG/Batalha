package batalha.teste;

import batalha.modelo.Heroi;
import batalha.modelo.Monstro;
import batalha.modelo.acoes;

public class Teste {

	public static void main(String[] args)  {
		Heroi h1 = new Heroi();
		Monstro m1 = new Monstro();
		
		h1.setAtaque(5);
		m1.setDefesa(4);
		
		
		
	
		
		for (int i= 1; i < 20; i++){
			
			// CALCULAR ATAQUE E DEFESA E RETIRAR O DANO FINAL
		System.out.println(acoes.calculaDano( h1.calculaAtaque(h1), m1.calculaDefesa(m1)));	
			
		}
		
	}
	
	}
