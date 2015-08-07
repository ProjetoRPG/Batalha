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
	
public Integer calculaDefesa (Personagem heroi){
	
	int defesa = 0;
	for(int j=1 ; j < heroi.getDefesa(); j++){
		
		defesa += dado.nextInt(4) + 1; 
		
	}
	System.out.print("defesa");
	System.out.println(defesa);

	
	return defesa;
}





}
