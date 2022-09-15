package jp.example;

public abstract class Character extends BattleCreature {
	String name;
	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	//戦う
	public abstract void attack(Monster m);
}
