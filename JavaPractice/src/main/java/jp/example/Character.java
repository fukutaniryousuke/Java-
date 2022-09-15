package jp.example;

public abstract class Character implements Creature {
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	//戦う
	public abstract void attack(Matango m);
}