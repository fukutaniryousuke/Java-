package jp.example;

public class Wizard extends Character {
	int mp;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを１０回復した");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に２０ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
	
	public Wizard(String name) {
		this.name = name;
		this.hp = 50;
		this.mp = 5;
	}
	
	public Wizard() {
		this("ななし");
	}
}
