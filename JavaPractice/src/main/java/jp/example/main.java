package jp.example;


public class main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name);
		
		Hero h2 = new Hero();
		System.out.println(h2.name);
		
		Wizard w = new Wizard("スガワラ");
		
		SuperHero sh = new SuperHero();
		Weapon we = new Weapon();
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(sh);
	}
}
