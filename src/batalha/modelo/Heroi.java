package batalha.modelo;



public class Heroi extends Personagem {
	

public int calculaAtaque( Personagem heroi){

		//ATAQUE
		int dano = 0;
		
		for (int i= 1; i < heroi.getAtaque(); i++){
			
		 dano += dado.nextInt(5) + 1;
			
		}
	 
		System.out.print("dano");
		System.out.println(dano);
		
		
		return dano;
		
	}
	






}
