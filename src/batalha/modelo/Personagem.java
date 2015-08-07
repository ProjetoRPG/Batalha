package batalha.modelo;

import java.util.Random;

public class Personagem {

	private Integer hp;
	private Integer ataque;
	private Integer defesa;

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	
	Random dado = new Random();

	
	
}
