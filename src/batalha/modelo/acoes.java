package batalha.modelo;

public class acoes {

	
	 public static int calculaDano(Integer ataque, Integer defesa) {
		
		if (ataque <= defesa){
			return 0;
		} else {
			return ataque - defesa ;
		}
		
	
	}
	
    }

