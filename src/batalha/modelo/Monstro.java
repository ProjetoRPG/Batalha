package batalha.modelo;

public class Monstro extends Personagem {

	public int calculaAtaque( Personagem monstro){

		//ATAQUE
		int ataque = 0;
		
		for (int i= 1; i < monstro.getAtaque(); i++){
			
		 ataque += dado.nextInt(5) + 1;
			
		}
	 
		System.out.print("dano");
		System.out.println(ataque);
		
		
		return ataque;
		
	}	
	
	
	public Integer calculaDefesa (Personagem monstro){
	
		int defesa = 0;
		for(int j=1 ; j < monstro.getDefesa(); j++){
			
			defesa += dado.nextInt(4) + 1; 
			
		}
		System.out.print("defesa");
		System.out.println(defesa);
	
		
		return defesa;
	}
	
	
}
