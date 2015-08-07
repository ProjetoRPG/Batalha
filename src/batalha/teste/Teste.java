package batalha.teste;

import batalha.controle.acoes;
import batalha.modelo.Heroi;
import batalha.modelo.Monstro;

public class Teste {

	public static void main(String[] args)  {
		Heroi h1 = new Heroi();
		Monstro m1 = new Monstro();
		
		h1.setAtaque(5);
		m1.setDefesa(4);
		
		//CRIAR BATALHA
		System.out.println("Batalha Inicia\n");
	
		
		
		System.out.println(acoes.calculaDano( h1.calculaAtaque(h1), m1.calculaDefesa(m1)));	
			
		
		
	}
	
	}
