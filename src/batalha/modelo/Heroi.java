package batalha.modelo;



public class Heroi extends Personagem {
	

public int calculaAtaque( Personagem heroi){

		//ATAQUE
		int ataque = 0;
		
		for (int i= 1; i < heroi.getAtaque(); i++){
			
		 ataque += dado.nextInt(5) + 1;
			
		}
	 
		System.out.print("dano");
		System.out.println(ataque);
		
		
		return ataque;
		
	}
	






}
