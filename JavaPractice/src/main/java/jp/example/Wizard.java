package jp.example;

public class Wizard {
	String name;
	int hp;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを１０回復した");
	}
	
	public Wizard(String name) {
		this.name = name;
		this.hp = 50;
	}
	
	public Wizard() {
		this("ななし");
	}
}
