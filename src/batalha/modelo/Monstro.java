package batalha.modelo;

public class Monstro extends Personagem {

	public Integer calculaDefesa (Personagem Monstro){
	
		int defesa = 0;
		for(int j=1 ; j < Monstro.getDefesa(); j++){
			
			defesa += dado.nextInt(4) + 1; 
			
		}
		System.out.print("defesa");
		System.out.println(defesa);
	
		
		return defesa;
	}
	
	
}
