package jp.example;

public class Wizard extends Character {
	private int hp;
	private int mp;
	private Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;
		int recovePoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovePoint);
		System.out.println(h.getName() + "のHPを" + recovePoint + "回復した");
	}
	
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に２０ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
	
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	
	public int getHp() { return this.hp; }
	public void setHp(int hp) { this.hp = hp; }
	
	public int getMp() { return this.mp; }
	public void setMp(int mp) { this.mp = mp; }
	
	public Wand getWand() { return this.wand; }
	public void setWand(Wand wand) { this.wand = wand; }
	
	public Wizard(String name) {
		this.name = name;
		this.hp = 50;
		this.mp = 5;
	}
	
	public Wizard() {
		this("ななし");
	}
}
