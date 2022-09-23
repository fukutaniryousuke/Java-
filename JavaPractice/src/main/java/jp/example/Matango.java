package jp.example;

public class Matango extends Monster {
	int hp = 50;
	final int LEVEL = 10;
	char suffix;
	public void run() {
		System.out.println("おばけキノコ" + this.suffix + "は逃げだした！");
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.getHp() -= 10;
	}
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public Matango() {
		this.suffix = 'A';
	}
}
