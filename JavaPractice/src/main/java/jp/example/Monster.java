package jp.example;

public abstract class Monster extends BattleCreature {
	int mp;
	
	public void run() {
		System.out.println("モンスターは逃げだした。");
	}
	
//	public abstract void attack();
}
